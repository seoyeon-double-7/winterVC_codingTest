package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentExample1 {
    public static void main(String[] args) {

        // Student 형식의 리스트에 값(이름, 점수) 넣어주기

        List<Student> studentList = Arrays.asList(
                new Student("일서연", 10),
                new Student("이서연", 20)
        );


        // stream 사용해서 평균 구하기

        double avg = studentList.stream()   //오리지널 스트림
                //람다식으로 참조하기, getScore로 중간처리
                .mapToInt(Student::getScore)
                // 최종처리
                .average()
                // double 타입으로 변경, 최종처리
                .getAsDouble();

        System.out.println("평균 : " + avg);


        // stream, forEach 사용해서 배열 순회하기

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        });


    }
}
