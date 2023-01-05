package 기본배열;
// 배열이란 : 같은 타입의 변수들로 이루어진 유한집합
//          배열을 구성하는 값을 배열의 요소(Element)라 하고, 배열에서의 위치를 index 라고 한다.
//          배열의 index 는 0부터 시작하며 음수값을 가질 수 없음.
// 배열 선언 방법 : 타입[] 배열이름 = new 타입[배열의 길이(index 값)]

public class BasicArray {
    public static void main(String[] args) {

        /*
        int[] score = new int[5]; // 배열을 선언하는 방법
        score[0] = 88;
        score[1] = 90;
        score[2] = 70;
        score[3] = 50;
        score[4] = 77;


        int[] score = {88,90,70,50,77}; // 배열을 선언과 동시에 초기화 하는 방법

        int sum = 0;
        for(int i = 0; i < score.length; i++) {     // length 는 배열의 길이를 의미함.
            sum += score[i];    // sum = sum + score[i]
        }
        System.out.println("총점 : " + sum);
        */

        int[] score = {33,44,50,67,50};
        // 총점과 평균 구하기
        int sum = 0;
        /*
        for(int i = 0; i < score.length ; i++) {

            sum += score[i];
        }
        */
        // 향상 된 for 문
        // 배열의 요소를 자동 순회한다
        for(int e : score) {
            sum += e;
        }

            System.out.println("총점 : " + sum);
            System.out.printf("평균 : %.2f\n", (double)sum/score.length);
    }
}
