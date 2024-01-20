package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class exam4 {
/*
* 4. 단어뒤집기
* - N 개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오
*
* 입력
* -첫줄에 자연수 N(3<=N<=20)이 주어집니다.
* -두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다
*
* N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집에서 출력합니다.
*
* */
    public static void main(String[] args) {

        exam4 T= new exam4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++) {
             str[i] = sc.next();
        }


        System.out.println(T.solution(n,str));
    }

    private ArrayList solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

 /*       for(String x: str){
            char[] s = x.toCharArray(); //단어스트링을 문자배열로 만든다.
            int lt = 0, rt=x.length()-1;
            while(lt<rt){

            }

        }*/

        return answer;

    }

}