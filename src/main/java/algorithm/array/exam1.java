package algorithm.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {

    /*1.큰 수 출력하기
    * N개의 정수를 입력받아. 자신의 바로 앞 수 보다 큰 수만 출력하는 프로그램을 작성하시오.
    * 첫줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음줄에 N개의 정수가 입력된다.
    * 자신의 바로 앞 수보다 큰 수만 한줄로 출력한다.*/
    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                answer.add(arr[i]);
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        exam1 T = new exam1();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =in.nextInt();
        }
        for(int x: T.solution(n,arr)){
            System.out.print(x+"");
        }
    }




}
