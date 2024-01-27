package algorithm.string;

import java.util.Scanner;

public class exam10 {
/*
* 10. 가장 짧은 문자 거리
* - 한개의 문자열 s와 문자 t가 주어지면 문자열 s와 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
*
* - 첫번쨰 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str,c));

    }

    private static int[] solution(String str,char c) {

        int[] answer = new int[str.length()];
        int p = 1000;

        //왼쪽...
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=0;
            }else{
                p++;
                answer[i]=p;
            }
        }

        //오른쪽
        p=1000;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=0;
            }else{
                p++;
                answer[i]=Math.min(answer[i],p); //기존값과 p중 작은값으로
            }
        }


        return answer;
    }


}