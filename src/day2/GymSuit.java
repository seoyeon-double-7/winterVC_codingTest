package day2;

import java.util.*;

// 내가 짠 코드

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 1];

        // 기본값 세팅해주기
        for (int i = 1; i < student.length; i++) {
            student[i] = 1;
        }

        // 분실한 학생 방
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]] = 0;
        }

        // 여분 학생 방
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]]++;
        }

        // 위치 비교해주기
        for (int i = 1; i <= n; i++) {

            // 여분이 있으면
            if (student[i] == 2) {
                // 1번째 방 이상이고(인덱스 값 넘치지 않게), 전 방이 부족하면
                // 부족한 방 값 플러스, 여분 방 마이너스
                if ((i - 1 >= 1) && student[i - 1] == 0) {
                    student[i - 1]++;
                    student[i]--;
                }
                // 앞에방이 부족하면(인덱스 방 넘치지 않게, 에러방지)
                else if ((i + 1 <= n) && student[i + 1] == 0) {
                    student[i + 1]++;
                    student[i]--;
                }
            }
        }


        // 0이 아닌 방 카운트 해주기
        int cnt = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] > 0) {
                cnt++;
            }
        }

        return cnt;
    }
}

// 다른 코드

class Solution2 {
    public int solution(int n, int[] lost, int[] reserve) {
        //방법1> 배열을 이용한 방법으로 풀이
        //lost 배열 : 체육복이 도난  학생 위치
        //reserve 배열 : 여벌의 체육복을 가지고 있는 학생의 위치
        int answer = 0;
        //1> answer 기본 참여 인원을 구함==>참여수-lost 하면
        answer = n - lost.length;

        //2> lost, reserve 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);


        //3> 도난 당한 학생들에게 체육복 빌려주는 경우
        //reserve에 있는값은 lost 이전에 위치와 lost다음 위치에 체육복을 빌려줄수 있음
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                //여벌의 체육복을 가지고 있는 학생이 도난을 당한 경우
                if ((lost[i] == reserve[j])) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
                //도난당한 체육복 빌려주는 경우
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;

    }
}
