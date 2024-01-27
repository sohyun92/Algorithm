package algorithm.string;

import java.util.Scanner;

public class exam7 {
/*
* 7.회문 문자열
* -앞에서 읽을 떄나 뒤에서 읽을때나 같은 문자열을 회문 문자열이라고 합니다.
* -문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }

    private static String solution(String str) {
        String answer = "YES";
        String strLowerCase = str.toLowerCase();
        int len =str.length();
        for(int i=0;i<len/2;i++){
            if(strLowerCase.charAt(i) != strLowerCase.charAt(len-i-1)){
                answer="NO";
                break;
            }
        }


     /*   String reverseStr = new StringBuilder(strLowerCase).reverse().toString();
        if(strLowerCase == reverseStr){
            answer ="YES";
        }else{
            answer="NO";
        }
    */



        return answer;
    }


}