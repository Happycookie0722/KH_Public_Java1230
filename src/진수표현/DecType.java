package 진수표현;
// 진법 표현 : 2진법(0, 1) , 8진법(0 ~ 7), 10진법 (0 ~ 9), 16진법 (0 ~ 9, a, b, c, d, e, f)
public class DecType {
    public static void main(String[] args) {
        int var1 = 0b1010; // 2진수는 숫자 앞에 0b를 넣으면 변환 된다.
        int var2 = 0206;   // 8진수는 숫자 앞에 0을 넣으면 변환 된다.
        int var3 = 365;    // 10진수는 변환 할 필요가 없다.
        int var4 = 0xBA;   // 16진수는 숫자 앞에 0x를 넣으면 변환 된다.

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }
}
