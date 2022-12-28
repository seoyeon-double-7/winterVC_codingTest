package day3;

import java.util.*;

class solution2 {
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int index = 0;
        int n;

        // case 1 : 내가 짠 코드

//        for (int i = 0; i < commands.length; i++) {
//            n = 0;
//            int[] arr = new int[commands[i][1] - commands[i][0] + 1];   // 방크기 할당
//            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {   // 자른 크기에 넣어주기
//                arr[n++] = array[j];
//            }
//            Arrays.sort(arr);   // 자른 배열 정렬
//            answer[i] = arr[commands[i][2] - 1];
//        }

        // case 2 : 쌤이 짜신 코드

        //1) 값 뽑아내기
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작값
            int end = commands[i][1];   // 끝값
            int k = commands[i][2]; // 순위에 해당하는 값

            int[] tmp = new int[end-start+1];  //추출
            int a=0;
            for (int j = start-1; j < end; j++) {
                tmp[a++] = array[i];
            }
            // Arrays=> copyofRange(배열, 시작, 끝)

            // 2) 정렬
            Arrays.sort(tmp);

            // 3) k번째 값 구하기
            answer[index++] = tmp[k-1];


        }

        return answer;
    }
}

public class Ksort {
    public static void main(String args[]) {

        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution2.solution(array, commands);

    }
}
