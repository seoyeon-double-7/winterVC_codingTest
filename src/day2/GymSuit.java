package day2;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+1];

        // 기본값 세팅해주기
        for(int i=1; i<student.length; i++){
            student[i] = 1;
        }

        // 분실한 학생 방
        for(int i=0; i<lost.length; i++){
            student[lost[i]] = 0;
        }

        // 여분 학생 방
        for(int i=0; i<reserve.length; i++){
            student[reserve[i]]++;
        }

        // 위치 비교해주기
        for (int i = 1; i <= n; i++) {

            // 여분이 있으면
            if (student[i] == 2) {
                // 1번째 방 이상이고(인덱스 값 넘치지 않게), 전 방이 부족하면
                // 부족한 방 값 플러스, 여분 방 마이너스
                if ((i - 1 >= 1) && student[i - 1] == 0) {
                    student[i-1]++;
                    student[i]--;
                }
                // 앞에방이 부족하면(인덱스 방 넘치지 않게, 에러방지)
                else if ((i + 1 <= n) && student[i + 1] == 0) {
                    student[i+1]++;
                    student[i]--;
                }
            }
        }


        // 0이 아닌 방 카운트 해주기
        int cnt = 0;
        for (int i = 0; i < student.length; i++) {
            if(student[i] > 0) {
                cnt++;
            }
        }

        return cnt;
    }
}
