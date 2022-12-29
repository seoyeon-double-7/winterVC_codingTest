package day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigNumber {

    public static void main(String args[]){

        int numbers[] = {3, 30, 34, 5, 9};
        String answer = "";


        // numbers : 숫자 --> 문자로 변환 --> 내림차순 정렬


        // 문자열 다루는 배열의 주어진 numbers를 문자로 저장
//        String arr[] = new String[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            arr[i] = Integer.toString(numbers[i]);
//            // ex) "3", "30", "34", "5", "9"
//        }




        // 문자가 시작하는 순서대로 정렬



        // 1) 버블 정렬
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                String s1 = arr[i];
//                String s2 = arr[j];
//                if((s1 + s2).compareTo(s2+s1)<0){
//                    arr[i]=arr[j];
//                    arr[j]=s1;
//                }
//            }
//        }




        // 2) sort
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2+o1).compareTo(o1+o2);
//            }
//        });


        // 3) 람다식
        //Arrays.sort(arr, (s1, s2)-> (s2+s1).compareTo(s1+s2));


        //4) stream으로 변환

        /* 문자열 비교 => 첫번째 문자 + 두번째 문자 => 숫자 문자열
         * 1) x.compareTo(y)
         * 2) x == y : 0
         * 3) x>y : 양수 : 내림 차순 정렬이라면 x 값이 크므로 자리 바꾸지
         *    x<Y : 음수
         *
         */

        String answer2 = IntStream.of(numbers)  // 정수 타입의 스트림으로 변경
                .mapToObj(String::valueOf)  // 스트링 타입으로 변경
                .sorted((s1,s2)->(s2+s1).compareTo(s1+s2))  //정렬
                .collect(Collectors.joining()); // 하나로 합치기

        if(answer2.startsWith("0")) answer2 = "0";  // 0으로 시작하는 문자열이면 0을 리턴


        // 0이 들어왔을 때 값을 문자열 0으로

//        for(String s:arr){
//            answer+=s;
//        }

        //if(answer.charAt(0) == '0') answer = "0";


        System.out.println(answer2);

    }
}
