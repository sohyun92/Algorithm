package algorithm.array;

import java.util.Scanner;

public class exam5 {

   /*5.
   소수
   자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요
   만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개입니다.

   * */
    private int solution(int n) {
      int answer = 0;
      int[] ch = new int[n+1]; //0으로 초기화됨...
      for(int i=2;i<n;i++){
          if(ch[i]==0){
              answer++;
            for(int j=i;j<=n;j=j+i) ch[j]=1;
          }
      }
      for(int i=2;i<n;i++){

      }
      return answer;
    }
    public static void main(String[] args) {
        exam5 T = new exam5();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();


        T.solution(n);

    }




}
