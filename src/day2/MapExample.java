package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {

    public static void main(String args[]) {


        // asDoubleStream

        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()   // double로 바꿔주기
                .forEach(d -> System.out.println(d));    // 최종출력
        System.out.println("================================");


        // boxed (많이 쓰임)

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()    //기본형 자료형 -> 랩퍼 오브젝트형으로
                .forEach(obj -> System.out.println(obj.intValue())); // 숫자형으로 값을 표현
        System.out.println("================================");


        // flatMap

        List<String> inputList1 = Arrays.asList("java8 Lamda", "stream mapping");
        inputList1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));

    }
}
