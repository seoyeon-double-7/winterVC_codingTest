package day5;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        //clothes : 옷 목록, 종류
        int answer = 0;

        // 1) Map 만들기
        // key에는 종류, value : 개수
        HashMap<String, Integer> map = new HashMap<>();


        // 2) 배열을 Map 테이블로 만들기
        for(String[] c : clothes){
            String type = c[1]; //종류를 type에 설정
            map.put(type, map.getOrDefault(type,0)+1);
        }

        // 3) 각 옷의 경우의  수
        Iterator<Integer> it = map.values().iterator();

        // 맵에 저장될 값들을 참조할 반복자 선언
        while(it.hasNext()){
            answer *= it.next().intValue()+1;
            // 모든 종류의 옷을 서로 곱해서 경우의 수를 구함
        }

        // none(어떤 종류)의 옷도 입지 않은 경우

        return answer-1;
    }
}