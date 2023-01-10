package 조건문1;

import java.util.Scanner;

// if(조건식) {조건식이 참인 경우 수행 됨}
public class ConditionEx1 {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위해 스캐너 객체 생성
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt(); // 키보드 입력을 정수형 변수에 담는다.
        if(number > 100) {
            System.out.println(number + "은 100보다 크다.");
        } else if(number < 100) {
            System.out.println(number + "은 100보다 작다.");
        } else {
            System.out.println(number + "은 100과 같다.");
        }

 */

        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력 하세요 : ");
        char ch = sc.next().charAt(0); // 입력 받은 문자열에서 첫번째 문자를 추출
        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자 입니다.");
        } else if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + "는 대문자 입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }

    }



}
