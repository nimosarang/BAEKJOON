package baekjoon.memo;


import java.util.Arrays;

class Solution {
    public String solution(String my_string) {

        char[] charArray = my_string.toLowerCase().toCharArray();

        Arrays.sort(charArray);

        String answer = new String(charArray);

        return answer;
    }
}