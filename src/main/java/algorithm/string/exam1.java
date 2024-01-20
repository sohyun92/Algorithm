package algorithm.string;

import java.util.Scanner;

public class exam1 {

    /*1.문자찾기
    * 한개의 문자열을 입력받고, 특정문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇개 존재하는지 알아내는 프로그램을 작성하라
    * 대소문자를 구분하지않는다. 문자열의 길이는 100을 넘지않는다.
    * 첫글자에 문자열이 주어지고 두번째 줄에 문자가 주어진다.
    * 문자열은 영어 알파벳으로 구성되어있다.
    * */
    private int solution(String str, char t) {
        int answer = 0;

        //3.대소문자 구분 없으므로 비교를 위해 하나로 변경
        str = str.toUpperCase();
        t =Character.toUpperCase(t);
        
        //4. for문돌면서 비교
        /*       for(int i=0;i<str.length();i++){
            if(str.charAt(i)==t){
                answer++;
            }
        }*/

        // 향상된 for문 방법
        for(char x : str.toCharArray()){
            //toCharArray : !!!!문자 배열 객체 생성!!!!!!
            if(x==t){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        exam1 T = new exam1();
        Scanner in=new Scanner(System.in);
        //1.문자열 받기
        String str =in.next();
        //2.문자 읽기
        char c = in.next().charAt(0);

        System.out.println(T.solution(str,c));

    }




}
