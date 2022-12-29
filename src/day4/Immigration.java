package day4;

import java.util.*;

class ImmigrationSolution {
    public long solution(int n, int[] times) {
        long answer = 0;

        // times : 심사자당 시간
        // n : 입국자들
        // 배열 소트
        Arrays.sort(times);
        long left = 1;  // 최소 걸리는 시간
        long right = (long)times[times.length-1] * n; // 최대 걸리는 시간

        // 최소와 최대 비교
        while(left <= right){
            // 중간값
            long mid = (left+right)/2;
            long sum = 0;
            for(int i=0; i<times.length; i++){
                sum+= mid/times[i];
            }
            if(sum<n){
                left = mid+1;
            }else{
                right = mid-1;
                answer = mid;

            }

        }


        //타임 배열을 반복하면서 중간값과 타입을 나눠서 합계를 구함



        return answer;
    }
}