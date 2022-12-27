package day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentExample {
    public static void main(String args[]){

        // 컬렉션으로 스트림 얻기
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20)
        );

        // 반복자(iterator)
        // 스트림(stream)
        Stream<Student> stream = studentList.stream();
        stream.forEach(s-> System.out.println(s.getName()));


        //배열로 스트림
        String[] strArray = {"홍홍홍", "김김김", "배배배"};
        Stream<String> strStream = Arrays.stream((strArray));
        strStream.forEach(a->System.out.println(a+","));
        System.out.println("----------------------------");

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a->System.out.println(a*2 + ","));
        System.out.println();
        System.out.println("----------------------------");




        // 숫자로 스트림
        //public static final int sum;
        IntStream stream1 = IntStream.rangeClosed(1,100);
        //stream1.forEach(a->sum+=a);
        //System.out.println("총합 : " + sum);


    }
}
