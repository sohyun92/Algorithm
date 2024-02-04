package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2 {

    /*2.보이는 학생
    * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질때, 맨앞에
    * 서있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하시오
    *
    * 첫줄에 정수N(5<=N<=100,000)이 입력된다 그 다음 에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.*/
    private Integer solution(int n, int[] arr) {
       int answer=1;
       int max = arr[0];
       for(int i=0;i<n;i++)
       {
           if(arr[i]>max){
               answer++;
               max = arr[i];
           }
       }
        return answer;
    }
    public static void main(String[] args) {
        exam2 T = new exam2();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        T.solution(n,arr);

    }




}
