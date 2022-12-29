package day4;
import java.util.*;
import java.util.stream.*;

class Solution3 {
    public int solution(int[] budgets, int M) {



        /* case 1 */


        // budget : 예산 선정
        // M : 총예산
        // 최소값
        // 최댓값

        int answer = 0;

        int min=0;
        int max= IntStream.of(budgets).max().orElse(0);

        // 최댓값과 최소값 비교
        // 중앙값 구하기
        // 합계 구하기

        while(min<=max){
            final int mid = (min+max)/2;

            int sum = IntStream.of(budgets)
                    .map(b->Math.min(b, mid))
                    .sum();

            if(sum<=M){
                min = mid+1;
                answer = mid;
            }else{
                max = mid-1;
            }
        }



        /* case 2 */


//        // budget : 예산 선정
//        // M : 총예산
//        // 최소값
//        // 최댓값
//
//        int answer = 0;
//        Arrays.sort(budgets);
//
//        int min=0;
//        int max= budgets[budgets.length-1]; //최대값
//
//        // 최댓값과 최소값 비교
//        // 중앙값 구하기
//        // 합계 구하기
//
//        while(min<=max){
//            int mid = (min+max)/2;
//
//            int sum=0;
//
//            for(int b:budgets){
//                if(b > mid){       // 신청한 예산이 상한액보다 큰 경우
//                    sum+=mid;      // 신청한 값으로!
//                }else{
//                    sum+=b;
//                }
//            }
//
//        }
//
//        // 총합계 금액과 총예산 비교
//        if(sum <= M){
//            min = mid+1;
//            answer = mid;
//        }else{
//            max = mid-1;
//        }
//


        return answer;
    }
}