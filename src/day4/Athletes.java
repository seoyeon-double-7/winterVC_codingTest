package day4;

import java.util.*;

class AthletesSolution {
    public String solution(String[] participant, String[] completion) {

        // participant : 참여자 목록
        // completion : 완주자 목록

        String answer = "";

//        /* 1) 정렬 후에 비교 */
//
//        // participant, completion 비교해주기
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        int i;
//        for(i=0; i<completion.length; i++){
//            if(!participant[i].equals(completion[i]))   // 참가자와 완주자가 같지 않으면 멈춤
//                break;
//        }
//
//        // 같지 않은 참가자의 이름 answer에 넣어주기
//        answer = participant[i];

        /* 2) */

        // 1) hashmap 만들기 (String, Integer)
        HashMap<String, Integer> map = new HashMap<>();


        // 2) hashmap 키와 값 삽입 ==> put
        // - 참여자 목록
        for(String player: participant) map.put(player, map.getOrDefault(player,0)+1);

        // - 완주자 목록
        for(String player: completion) map.put(player, map.get(player)-1);

        // 3) 반복자를 이용해서 키에 해당하는 값 알아오기

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer>entry = iterator.next();
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }

//        for(String key : map.keySet()){
//            if(map.get(key) != 0){
//                answer = key;
//            }
//        }


        return answer;
    }
}