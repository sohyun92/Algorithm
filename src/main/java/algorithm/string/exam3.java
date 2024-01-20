package algorithm.string;

import java.util.Scanner;

public class exam3 {
    /*
    * 문장 속 단어
    * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴단어를 출력하는 프로그램을 작성하세여
    * 문장속 단어는 공백으로 구분됨
    *
    * 입력
    * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다.
    * 문장은 영어 알파벳으로만 구성되어 있습니다.
    *
    * 출력
    * 첫 줄에 가장 긴 단어를 출력한다.
    * 가장 길이가 긴 단어일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
    * */
    public static void main(String[] args) {
        exam3 T = new exam3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // !!p
        System.out.println(T.solution(str));

    }

    private String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE; // 가장 작은값으로 초기화

        String[] s = str.split(" "); // 띄어쓰기로 자르기!!!!

        for(String x : s){
            int len = x.length();
            if(len>m){
                m =len;
                answer = x;
            }
        }
        return answer;
    }
}
