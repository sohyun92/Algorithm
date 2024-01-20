package algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class exam5 {
/*
* 5.특정 문자뒤집기
* 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고
* 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
*
* 입력
* 첫줄에 길이가 100을 넘지않는 문자열이 주어집니다.
*
* 출력
* 첫글에 알파벳만 뒤집힌 문자열을 출력한다.
* */
    public static void main(String[] args) {

        exam5 T= new exam5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }

    private String solution(String str) {
        String answer = "";
        int lt = 0;
        int rt = str.length()-1;

        char[] strChar = str.toCharArray(); //문자배열

        while(lt<rt){
            if(!Character.isAlphabetic(strChar[lt])){
                //알파벳이 아닐때
                lt++;
            }else if(!Character.isAlphabetic(strChar[lt]))
            {
                rt--;
            }
            else{
                char tmp = strChar[lt];
                strChar[lt] = strChar[rt];
                strChar[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(strChar);
        return answer;
    }


}