package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class exam6 {

   /* 6. N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면
   그 소수를 출력하는 프로그램을 작성하세요
   예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력
   단 910을 뒤집으면 19로 숫자화해야된다.
   첫자리 0은 무시

   * */
    public boolean isPrime(int num){
        if(num ==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    private ArrayList<Integer> solution(int n, int[] a) {
      ArrayList<Integer> answer = new ArrayList<>();

      for(int i=0;i<n;i++){
          int tmp = a[i];
          int res = 0;
          while(tmp>0){
              int t= tmp%10;
              res=res*10+t;
              tmp=tmp/10;
          }

          if(isPrime(res)){
              answer.add(res);
          };

      }
      return answer;
    }
    public static void main(String[] args) {
        exam6 T = new exam6();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }

        T.solution(n,a);

    }




}
