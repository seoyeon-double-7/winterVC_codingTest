package day4;

import java.util.*;

class NumberGameSolution {
    public int solution(int[] A, int[] B) {
        // A : 첫번째 팀
        // B : 두번째 팀 => B침의 승점 개수
        // A침을 보고

        int answer = 0;



        /* case 1  */
        // 방법 1

        Arrays.sort(B); // 오름차순 정렬

        // A를 이길 수 있는 B찾기 => 이중 for
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] < B[j]){
                    answer++;
                    B[j]=0;
                    break;  //5137 ==> 2268
                }
            }
        }



        /* case 2

        // A, B 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        // B의 길이
        int key = B.length-1;

        for(int i=A.length-1; i>=0; i--){

            if(A[i] < B[key]){  // B팀의 점수가 더 높다면
                key--;          // 다음 팀원으로 이동
                answer++;       // 승점 증가
            }
        }
        */


        return answer;
    }
}