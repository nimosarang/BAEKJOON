package programmers;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        Solution.solution(emergency);
    }

}
