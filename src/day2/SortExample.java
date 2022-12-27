package day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortExample {

    public static void main(String args[]) {

        // 기본 자료형 정렬

        int[] intArray = {5, 3, 2, 1, 4};
        IntStream intStream = Arrays.stream(intArray);
        intStream.sorted().forEach(n -> System.out.println(n));
        System.out.println("===========================");


        // 클래스 정렬 => comparable (오름차순)

        List<Student1> stuList = Arrays.asList(new Student1("A", 33), new Student1("B", 0), new Student1("C", 55));
        stuList.stream().sorted().forEach(s -> System.out.println(s.getScore()));
        System.out.println("===========================");


        // 클래스 정렬 => comparator (내림차순)

        stuList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));

    }

}
