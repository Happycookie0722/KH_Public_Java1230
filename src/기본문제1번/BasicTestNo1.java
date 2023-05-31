package 기본문제1번;


import java.util.Scanner;

// 한번에 정수 여러개를 입력 받아서 합계 구하기 (입출력과 반복문)
public class BasicTestNo1 {
    public static void main(String[] args) {
        // 입력 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 0; // 합계를 누적하기 위한 변수 생성
        for(int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
        }
        System.out.println("합계 : " + sum);
    }
}
