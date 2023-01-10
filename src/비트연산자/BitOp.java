package 비트연산자;
// 비트연산자 : 0과 1로 구성된 비트 단위의 연산을 수행
// & (비트 AND) : 연산을 수행하는 두 개의 비트가 모두 1인 경우 1이 됨
// | (비트 OR) : 연산을 수행하는 두 개의 비트 중 1개만 1이면 1이 됨
// ^ (XOR) : 두 개의 비트가 같으면 0, 다르면 1이 됨
// ~ (비트를 반전) : 비트가 0이면 1, 1이면 0으로 만듦
// << (Shift 연산자) : 지정된 수만큼 비트를 왼쪽으로 이동, 2를 곱한 것과 같음
// >> (Shift 연산자) : 지정된 수만큼 비트를 오른쪽으로 이동, 2를 나눈 것과 같음
public class BitOp {
    public static void main(String[] args) {
        int num1 = 10; // 0000 1010 2진법으로 변환한 값
        int num2 = 12; // 0000 1100
                       // 0000 1000 & 연산자로 위의 값을 계산한 값
                       // 0000 1110 | 연산자로 계산
                       // 0000 0110 ^ 연산자로 계산
                       // 0001 0100 << 연산자 사용
                       // 0000 0110 >> 연산자 사용
        System.out.println(num1 & num2); // 8
        System.out.println(num1 | num2); // 14
        System.out.println(num1 ^ num2); // 6
        System.out.println(~ num1); // -11
        System.out.println(num1 << 1); // 20
        System.out.println(num1 >> 1); // 5



    }
}
