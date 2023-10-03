package programmers;

public class Main {


    class Solution {

        public int solution(String before, String after) {
            int answer = 0;

            StringBuilder sb = new StringBuilder(before);

            StringBuilder reverse = sb.reverse();

            if (!after.contentEquals(reverse)) {
                answer = 0;
            } else {
                answer = 1;
            }

            return answer;
        }
    }

}
