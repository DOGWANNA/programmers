public class EvenAndOdd {
    //프로그래머스 lv 0. 짝수와 홀수 문제풀이
    public String solution(int num) {
        return (num%2==0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenAndOdd obj = new EvenAndOdd();

        String answer = obj.solution(3);
        System.out.println(answer);
    }
}
