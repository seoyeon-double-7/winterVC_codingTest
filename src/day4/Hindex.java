package day4;

public class Hindex{
        public static void main(String args[]){
                int citations[] = {3,0,6,1,5};
                Solution.solution(citations);
        }
}

class Solution{
        public static int solution(int[] citations) {
                int answer = 0;

                for(int i=0; i<citations.length; i++){
                        for (int j = 0; j < citations.length; j++) {
                                //if()
                        }
                }

                return answer;
        }
}

