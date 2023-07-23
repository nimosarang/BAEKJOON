package practice;

public class programmers {

    public int solution(int n) {
        int answer = 0;

        for(int i=0; i <= n; i++){
            if(i%2 == 0){
                answer += i;
            }
        };

        return answer;
    }

    public static void main(String[] args) {

        programmers programmers = new programmers();

        System.out.println(programmers.solution(10));


    }

}
