package algorithm.string;

import java.util.Scanner;

public class exam2 {
    /*
    * 2.대소문자 변환
    * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하라
    *
    * 입력
    * 첫줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다.
    * 문자열은 영어 알파벳으로만 구성되어있다.
    *
    *
    * */
    private String solution(String str) {
        String answer = "";

        for(char c: str.toCharArray()) {


        /*
            //내가 푼 문제
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);

            }
        */
            if(c>=97 && c<=122){
                //아스키코드로 푸는경우 소문자인경우
                answer+=(char)(c-32);
            }else{
                answer+=(char)(c+32);
            }
        
        
        }
        

        return answer;
    }

        public static void main(String[] args) {
        exam2 T =new exam2();
        Scanner sc = new Scanner(System.in);

        //첫줄에 문자열이 입력된다.
        String str = sc.next();
        System.out.println(T.solution(str));
    }


}
