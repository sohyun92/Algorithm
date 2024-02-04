package algorithm.array;

import java.util.Scanner;

public class exam4 {

   /*4.
   피보나치 수열
   1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
   2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력된다면 1,1,2,3,5,6,13 을 출력하면 된다.

   첫줄에 총 항수 N(3<=N<=45) 이 입력된다.
   첫줄에 피보나치 수열을 출력한다.
   * */
    private int[] solution(int n) {
      int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
      for(int i=2;i<n;i++){
          answer[i]=answer[i-1]+answer[i-2];
      }
        return answer;
    }
    public static void main(String[] args) {
        exam4 T = new exam4();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();


        T.solution(n);

    }




}
