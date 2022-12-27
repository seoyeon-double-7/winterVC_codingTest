package day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LoopExample {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArr);

        intStream

                .filter(a -> a % 2 == 0) // 짝수

                .peek(n -> System.out.println(n))

                .sum();

        System.out.println("============================");

        IntStream intStream1 = Arrays.stream(intArr);

        intStream1

                .filter(a -> a % 2 == 1) // 홀수

                .forEach(n -> System.out.println(n));

// 매칭

        int[] intArray1 = {2, 4, 6};

        boolean result = Arrays.stream(intArray1)

                .allMatch(a -> a % 3 == 0); // 모두 만족

        System.out.println("모두 3의 배수인가? : " + result);

        result = Arrays.stream(intArray1)

                .anyMatch(a -> a % 3 == 0); // 하나만 만족

        System.out.println("3의 배수가 하나라도 있는가? : " + result);

        result = Arrays.stream(intArray1)

                .noneMatch(a -> a % 3 == 0); // 하나만 만족

        System.out.println("3의 배수가 없는가? : " + result);

// 최종결과물의 디폴트 값

        List<Integer> list = new ArrayList<>();

        double avg = list.stream()

                .mapToInt(Integer::intValue)

                .average()

// 집계값이 없을 경우 대비

                .orElse(0.0);

        System.out.println("결과 : " + avg);

        list.stream()

                .mapToInt(Integer::intValue)

                .average()

// 집계값이 있을 경우에만 동작

                .ifPresent(a -> System.out.println("평균 : " + a));

    }

}