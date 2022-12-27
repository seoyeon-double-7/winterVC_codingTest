package day2;

import java.util.*;

public class ArrayAverage {
    public static void main(String args[]) {
        int numbers1[] = {1,2,3,4,5,6,7,8};
        int numbers2[] = {1,2,3,4,5,6,7,8};

        double answer = 0;

        // 1. for문을 이용한 방법
        
        int nLeng = numbers1.length;
        for(int i=0; i<numbers1.length; i++){
            answer += numbers1[i];
        }
        answer/=nLeng;
        System.out.println("for문 이용 : "+answer);

        // 스트림
        answer = Arrays.stream(numbers1)
                .average()
                .orElse(0);
        System.out.println("스트림 이용 : "+answer);



    }
}
