package practice;

import java.util.Map;
import java.util.HashMap;

public class TestSo {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8},2);

    }
}

class Solution {
    public int[][] solution(int[] num_list, int n) {

        int[][] answer = new int[num_list.length/n][n];

        int idx = 0;

        for(int i=0; i<answer.length; i++){

            for(int j=0; j<n; j++){

                answer[i][j] = num_list[idx];

                idx++;

            }
        }
        return answer;
    }
}

