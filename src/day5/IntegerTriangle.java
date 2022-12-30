package day5;

class IntegerTriangleSolution {
    public int solution(int[][] triangle) {
        // triangle : 삼각형
        // 1) 별도의 저장 공간을 다로 만들어서 사용(DP 테이블)
        // 계산할 공간을 저장할 배열 생성

        // 2) DP 테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
        // 계산은 현재값과 왼족(DP[i-1][j]), 오른족 dp([i-1][j-1])

        int answer = 0;


        /*  방법 1 */

        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                // 제일 왼쪽 (위에 있는것만 더해주기)
                if(j==0){
                    triangle[i][j] += triangle[i-1][j];
                }
                // 제일 오른쪽 (위의 왼쪽에 있으므로 i, j에서 1씩 빼주기)
                else if(i==j){
                    triangle[i][j]+=triangle[i-1][j-1];
                }
                // 가운데 (좌, 우 비교)
                else{
                    int left = triangle[i-1][j-1];  // 왼쪽(j에서 1 빼주기)
                    int right = triangle[i-1][j];   // 오른쪽(j는 그대로)

                    // 큰값 triangle[i][j]에 넣어주기
                    if(left > right) triangle[i][j]+= left;
                    else triangle[i][j] += right;
                }

                // 가장 큰값 answer에 넣어주기
                if(answer < triangle[i][j]) answer = triangle[i][j];
            }

        }


        return answer;
    }
}