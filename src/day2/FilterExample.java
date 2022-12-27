package day2;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String args[]) {


        List<String> names = Arrays.asList("일서연", "이서연", "삼서연", "일서연", "사서연");


        // 중복제거 한 후 리스트 순회하며 값 출력 (일서연, 이서연, 삼서연, 사서연)
        names.stream()                                  //오리지널 스트림 변환
                .distinct()                             // 중간처리 ==> 중복제거
                .forEach(n -> System.out.println(n));    //최종처리
        System.out.println("===============================");


        // 중복제거 안하고, 일로 시작하는 요소 출력 (일서연, 일서연)
        names.stream()
                .filter(n -> n.startsWith("일"))
                .forEach(n -> System.out.println(n));
        System.out.println("===============================");


        // 중복 제거하고, 일로 시작하는 요소 출력 (일서연)
        names.stream()
                .distinct()
                .filter(n -> n.startsWith("일"))
                .forEach(n -> System.out.println(n));


    }
}
