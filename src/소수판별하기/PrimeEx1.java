package 소수판별하기;

import java.util.Scanner;

// 메소드를 이용한 소수 판별하기
// 1과 자기 자신외에는 나누어지지 않는 수
// 정수를 입력 받아서 해당 정수 미만의 소수를 찾아 합을 구하기
// 12를 입력 3,5,7,11을 더한 값 26
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < num; i++) sum = primeSum(i);
        System.out.println("소수의 합 : " + sum);

    }
    // 매개변수로 전달 받은 정수값이 소수인지 아닌지 판별하기
    static int primeSum(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++ ) {
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }

}
