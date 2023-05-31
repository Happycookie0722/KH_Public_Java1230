package 기본문제2번;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 양의 정수 n을 입력 받아 n * n 크기의 행렬을 출력하는 프로그램 작성
// 이 때 행렬의 값은 1부터 시작하여 왼쪽에서 오른쪽, 위에서 아래 순서대로 채워넣음
public class BasicTestNo2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("행렬 n 값 입력 : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n * n; i++) {
//            System.out.printf("%4d", i);
//            if(i % n == 0) System.out.println();
//        }
//    }

    // 1 ~ 1000 사이의 7의 배수를 구하고 한 줄에 10개 항목 씩 출력
//    public static void main(String[] args) {
//        int count = 0;
//        for(int i = 1; i <= 1000; i++) {
//            if(i % 7 == 0) {
//                System.out.printf("%4d", i);
//                count++;
//                if(count == 10) {
//                    System.out.println();
//                    count = 0;
//                }
//            }
//        }
//    }

    // n 개의 정수를 입력 받아 최소값과 최대값 구하기
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        int[] i = new int[n];
//
//        for(int c = 0; c < i.length; c++) {
//            System.out.print("숫자 입력 : ");
//            i[c] = sc.nextInt();
//        }
//
//        int min = i[0];
//        int max = 0;
//        for(int c = 0; c < i.length; c++) {
//            if(min > i[c]) min = i[c];
//            if(max < i[c]) max = i[c];
//        }
//        System.out.println(min + " " + max);
//    }
    // 중복 없는 로또 번호 생성하기 : 1 ~ 45 사이의 임의의 수 6개 (ArrayList 사용)
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add((int) ((Math.random() * 45) +1));
//        int i = 0;
//        while(i <= 4) {
//            int num = (int) ((Math.random() * 45) +1);
//            if(arr.get(i) != num) {
//                arr.add(num);
//            }
//            i++;
//        }
//        for(int e : arr) System.out.print(e + " ");
//    }

    // 10개의 배열에서 중복된 숫자 입력 후 2번째 숫자 찾기
    // 찾는 두번째 수가 없는 경우 -1 반환
    // 임의의 수 10개 입력 하기
    // 찾을 숫자 :
    // 결과 :
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> arr = new ArrayList<>();
//        System.out.print("임의의 수 입력 : ");
//        for(int i = 0; i < 10; i++) {
//            int n = sc.nextInt();
//            arr.add(n);
//        }
//
//        System.out.print("찾을 숫자 : ");
//        int num = sc.nextInt();
//
//        int count = 0;
//        int rst = 0;
//        for(int i = 0; i < arr.size(); i++) {
//            if(arr.get(i) == num) {
//                count++;
//                if(count == 2) {
//                    System.out.println(i+1);
//                    break;
//                }
//            }
//        }
//        if(count < 2) System.out.println(-1);
//    }

    // 입력 받은 수가 소수인지 아닌지 판별하기
    // 소수 : 1과 자기 자신 이외에는 나누어지지 않는 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수 판별하려는 숫자 입력 : ");
        int num = sc.nextInt();
        if(isPrime(num)) System.out.println("소수입니다.");
        else System.out.println("소수가 아닙니다.");
    }
    // 재사용이 필요할 경우 static 으로 메서드 만들기
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
