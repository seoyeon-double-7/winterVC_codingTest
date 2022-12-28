package day3;


class solution {

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        // n : 아파트 등갯수
        // stations : 기지국이 설치된 위치
        // w : 전파위치

        //배열로 접근
        // 배열에 접근할 수 있는 인덱스 번호
        int index = 0;  // stations의 인덱스 번호
        int able = 2 * w + 1;

        //순회 시작할 위치(아파트 위치)
        int position = 1;



        /*
        * *********************  case 1 : 내가 짠 코드  *********************

       // 배열값 담을거
        int pos;

        for(int i=0; i<stations.length; i++){
            pos = stations[i];  // 배열값 답기
            if(position + w < pos){ // 현재 포지션과 전파량의 합이 설치된 기지국 위치보다 적으면
                index = (pos - w - position);   // 기지국 위치에서 전파량과 위치값을 빼줌 (왼쪽)
                if(index % able != 0) answer++; // 새로 설치할 자리에서 전파량(전체) 나머지가 0이 아니면 앤서 증가
                answer += index/able;   // 한번 더 나눠 준것 더해주기
            }
            position = pos + w+1;   // 포지션에 설치된 기지국 오른쪽 위치 담아주기
        }
        if(position-1 < n){ //포지션값이 배열길이보다 작으면
            index = n - position-1; // 인덱스에 오른쪽 방번호를 빼줌
            if(index%able!=0)answer++;
            answer += index/able;
        }
        *
        */


        
        
        // *********************  case 2 : 쌤이 짜신 코드  *********************
        

        // 현재 위치에서 아파트 등을 반복하면서
        while (position <= n) {

            // 1 기존에 기지국이 설치가 되어 있는 경우 => 전파를 받을 수 있는 아파트 최소 범위값보다
            if(index < stations.length && stations[index]-w <= position){
                position = stations[index] + w + 1;
                index++;
            }

            // 2 새롭게 설치하는 경우
            else{
                answer++;   // 기지국 새롭게 설치
                position += 2*w+1;  // 전파범위 => 기지국의 왼족, 오른족 부분의 범위
            }

        }


        return answer;
    }

}



public class BaseStation {

    public static void main(String args[]){

        int n=16;
        int stations[] = {9};
        int w=2;

        System.out.println(solution.solution(n, stations, w));

    }
}