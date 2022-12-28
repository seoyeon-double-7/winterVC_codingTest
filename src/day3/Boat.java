package day3;

import java.util.Arrays;

public class Boat {
    public static void main(String args[]){
        int[] people1 = {70,50,80,50,60};
        int[] people2 = {70,80,50};
        int[] people = {40,60,70,80,50};

        int limit = 100;

        int answer = 0; // 보트의 이동 횟수

        // 가벼운 몸무게 저장할 변수
        int first = 0;

        // 무거운 몸무게를 정할 변수
        int last = people.length-1;

        // 정렬
        Arrays.sort(people);

        // 가벼운 몸무게에서 가장 무거운 몸무게 합이 limit 범위에 들어가는지 체크
        // limit 보다 작으면 first 증가
        // limit 보다 크면 last 감소하며 비교
        while(first<=last) {
            answer++;
            if (people[first] + people[last] <= limit) {
                first++;
            }
            last--;
        }

        for(int i=0; i<people.length; i++){
            System.out.println(people[i]);
        }

        System.out.println(answer);

    }
}



