package day5;

import java.util.*;

class IntegerTriangleSolution {
    public int solution(int[][] triangle) {

        int answer = 0;


        /*  방법 1 */

//        for(int i=1; i<triangle.length; i++){
//            for(int j=0; j<triangle[i].length; j++){
//                // 제일 왼쪽 (위에 있는것만 더해주기)
//                if(j==0){
//                    triangle[i][j] += triangle[i-1][j];
//                }
//                // 제일 오른쪽 (위의 왼쪽에 있으므로 i, j에서 1씩 빼주기)
//                else if(i==j){
//                    triangle[i][j]+=triangle[i-1][j-1];
//                }
//                // 가운데 (좌, 우 비교)
//                else{
//                    int left = triangle[i-1][j-1];  // 왼쪽(j에서 1 빼주기)
//                    int right = triangle[i-1][j];   // 오른쪽(j는 그대로)
//
//                    // 큰값 triangle[i][j]에 넣어주기
//                    if(left > right) triangle[i][j]+= left;
//                    else triangle[i][j] += right;
//                }
//
//                // 가장 큰값 answer에 넣어주기
//                if(answer < triangle[i][j]) answer = triangle[i][j];
//            }
//
//        }

        /* 방법 2 */

        // triangle : 삼각형
        // 1) 별도의 저장 공간을 다로 만들어서 사용(DP 테이블)
        // 계산할 공간을 저장할 배열 생성

        int max = 0;
        int dp[][] = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];  // 첫번째 값 => 첫번째 줄

        // 2) DP 테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
        // 가장 왼쪽(DP[i-1][j]), 오른쪽 dp([i-1][j-1]) 계산
        for (int i = 0; i < triangle.length; i++) {
            //왼쪽
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
        }


        // 세번째 줄부터
        for (int i = 2; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + triangle[i][j], dp[i - 1][j] + triangle[i][j]);
                // 대각선과 계산, 위에 값 개산 중 큰것

            }
        }

        // 맨 마지막 줄의 제일 큰 수 찾기
        for (int x : dp[triangle.length-1]) {
            if (max < x) {
                max = x;
            }
        }


        return answer;
    }
}