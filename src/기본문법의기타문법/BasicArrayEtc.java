package 기본문법의기타문법;
//  커멘더 라인 입력
import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {
       /*
        int[] score = new int[5]; // 국어, 영어, 수학, 과학, 미술
        for(int i = 0; i <= score.length; i++) {    // i <=score.length 인덱스 값은 score[0] ~ [4]까지 인데 배열의 갯수는 5개를
            score[i] = 100;                         // 만들었으므로,  i<=score.length 가 아닌 i<score.length 로 해야 score[4]까지 출력
        }
        System.out.println(Arrays.toString(score));
        */

        if(args.length != 2) {
            System.out.println("외부 입력 값이 없습니다.");
            System.exit(0); // 프로그램을 강제 종료한다.
        }
        String strVal1 = args[0];
        String strVal2 = args[1];

        int num1 = Integer.parseInt(strVal1);
        int num2 = Integer.parseInt(strVal2);
        System.out.println("외부로부터 입력 받은 값 : " + (num1 + num2));
    }

}
