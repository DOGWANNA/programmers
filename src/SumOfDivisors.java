public class SumOfDivisors {
    //프로그래머스 lv 0. 약수 더하기 문제풀이
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        SumOfDivisors obj = new SumOfDivisors();
        int answer = obj.solution(5);
        System.out.println(answer);
    }
}
