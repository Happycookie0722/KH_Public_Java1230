package 저항;
// 3개의 컬러를 입력 받음(문자열로 입력)
// 첫번째 컬러 : 10의 자리수
// 두번째 컬러 : 1의 자리수
// 세번째 컬러 : 곱을 의미
import java.util.Objects;
import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "gray", "white"};
        int[] numArr = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        long result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("색 입력 : ");
        String fstColor = sc.next();
        for (int i = 0; i < colorArr.length; i++) {
            if (fstColor.equals(colorArr[i])) {
                result1 = i;
            }
        }
        System.out.print("색 입력 : ");
        String sndColor = sc.next();
        for (int i = 0; i < colorArr.length; i++) {
            if (sndColor.equals(colorArr[i])) {
                result2 = i;
            }
        }
        System.out.print("색 입력 : ");
        String trdColor = sc.next();
        for (int i = 0; i < colorArr.length; i++) {
            if (trdColor.equals(colorArr[i])) {
                result3 = numArr[i];
            }
        }
        result = (((long) result1 * result3) + ((long) result2 * result3));
        System.out.println(result);
    }
}
