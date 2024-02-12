package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class exam7 {

   /* 6. N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면
   그 소수를 출력하는 프로그램을 작성하세요
   예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력
   단 910을 뒤집으면 19로 숫자화해야된다.
   첫자리 0은 무시

   * */

    private Integer solution(int n, int[] a) {
     int answer = 0, cnt=0;
     int[] b =new int[a.length];

     for(int i=0;i<n;i++){
            if(a[i]==1){
                cnt++;
                answer+=cnt;
            }else{
               cnt=0;
            }

     }


      return answer;
    }
    public static void main(String[] args) {
        exam7 T = new exam7();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }

        T.solution(n,a);

    }




}
