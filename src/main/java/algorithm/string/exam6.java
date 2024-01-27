package algorithm.string;

import java.util.Scanner;

public class exam6 {
/*
* 6. 중복문자제거
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요
* 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* -입력
* --첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지않는다.
*
* 출력
* -첫 줄에 중복된 문자열을 출력합니다.
* */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }

    private static String solution(String str) {
        String answer = "";
        for(int i =0;i<str.length();i++){
            str.indexOf(str.charAt(i)); //indexOf 처음발견되는 index번호..!
            if(i == str.indexOf(str.charAt(i))){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }


}