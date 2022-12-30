package day5;

import java.util.Arrays;

class PhoneNumberListSolution {
    public boolean solution(String[] phone_book) {
        //phone_book : 전화목록
        
        /* case 1 : for문 써서 풀기 */


        boolean answer = true;


        // phone_book 정렬 시켜주기
        Arrays.sort(phone_book);

        // phone_book i번재 방이랑 i+1번째 방에 있는 번호가 같으면 false
        // i+1번째 방이랑 비교하는 거니까 length-1까지 반복

        for(int i=0; i<phone_book.length-1; i++){

            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            }
        }

        // 싹다 통과되면 접두사 없는 거니까 true인 answer을 반환


        return answer;
        
        
        /* 해쉬 쓰기 */
        
        
    }
}
