package algorithm.string;

import java.util.Scanner;

public class exam9 {
/*
* 9. 숫자만 추출
* - 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
* - 만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205입니다.
*
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }

    private static int solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                //숫자인지 isDigit
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }


}