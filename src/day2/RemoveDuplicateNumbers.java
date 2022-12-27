package day2;

import java.util.Arrays;

public class RemoveDuplicateNumbers {
    public static void main(String args[]) {

        int array[] = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int answer = 0;

        // 1. for문 기반
        for(int i=0; i<array.length; i++)
            if(array[i] == n) answer++;

        // 2. 필터 사용하기
        answer = (int) Arrays.stream(array)
                .filter(a->a==n)
                .count();

    }
}
