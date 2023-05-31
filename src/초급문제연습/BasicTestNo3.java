package 초급문제연습;

// 1번 문제
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램

// 2번 문제
// 3자리의 정수를 입력 받아 가장 큰 수 출력

// 3번 문제
// 사용자에 의해 2개의 문자열을 입력
// 처음부터 두 개의 문자열을 비교하여 공통의 글자가 몇 개인지 확인
// 공통 부분 문자열과 그 길이를 인쇄
// 부분 문자열이 없으면 "No CS"로 인쇄하고 0을 길이로 인쇄

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicTestNo3 {
    // 1번 문제
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("단어를 입력하세요 : ");
//        String input = sc.nextLine();
//        char[] arr = input.toCharArray();
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] < 97) arr[i] = (char)(input.charAt(i)+32);
//            else arr[i] = (char)(arr[i]-32);
//        }
//        for(char e : arr) System.out.print(e);
//    }

    // 2번 문제
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("테스트 할 횟수 입력 : ");
//        int num = sc.nextInt();
//        maxNum(num);
//    }
//    static void maxNum(int num) {
//        List<Integer> list = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int min, max = 0;
//        for(int i = 0; i < num; i++) {
//            System.out.print("세 자리 정수 입력 : ");
//            list.add(sc.nextInt());
//        }
//        min = list.get(0);
//        for(int i = 1; i < list.size(); i++) {
//            if(list.get(i) < min) min = list.get(i);
//            if(list.get(i) > max) max = list.get(i);
//        }
//        System.out.print("min : " + min + " max : " + max);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String arr1 = sc.nextLine();
        System.out.print("두번째 문자열 입력 : ");
        String arr2 = sc.nextLine();

        List<Character> list = new ArrayList();
        for(int i = 0; i < arr1.length(); i++) {
            if(arr1.charAt(i) == arr2.charAt(i)) {
                list.add(arr1.charAt(i));
            }
        }
        if(list.size() == 0) System.out.print("No CS " + -1);
        else System.out.print(list + " 길이 : " + list.size());
    }
}
