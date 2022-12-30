package day5;

import java.util.*;

class PhoneNumberListSolution {
    public boolean solution(String[] phone_book) {
        //phone_book : 전화목록

        /* case 1 : for문 써서 풀기 */


        boolean answer = true;


//        // phone_book 정렬 시켜주기
//        Arrays.sort(phone_book);
//
//        // phone_book i번재 방이랑 i+1번째 방에 있는 번호가 같으면 false
//        // i+1번째 방이랑 비교하는 거니까 length-1까지 반복
//
//        for (int i = 0; i < phone_book.length - 1; i++) {
//
//            if (phone_book[i + 1].startsWith(phone_book[i])) {
//                answer = false;
//            }
//        }
//
//        // 싹다 통과되면 접두사 없는 거니까 true인 answer을 반환
//
//
//        return answer;



        /* case 2 : HashMap을 이용한 코드로 변경 */
        // 1) Map 만들기 : 전화번호 값(key), value : 전화번호와 인덱스
        HashMap<String, Integer> map = new HashMap<>();

        // 2) Map에 값 넣기
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        // 3) 전화번호 값이 map에 존재하는지 확인
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
        }

        // 이중 for문을 반복하는데, 바깥쪽 for문은 배열 길이만큼 반복
        // 안쪽 for문은 phone_book[i] 길이만큼 반복
        // 0부터 문자열 길이 만큼 반복할 때마다 문자열을 쪼개서 해시에 포함하고 있는지 찾기
        // 포함할 경우 해당 문자열을 접두사로 사용한 전화번호가 있는 것이므로 false 반화냐

        return answer;

    }
}
