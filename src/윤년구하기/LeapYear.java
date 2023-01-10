package 윤년구하기;
// 연도가 4로 나누어지면 윤년이다. (4의 배수)
// 100으로 나누어지면 윤년이 아니다.
// 400으로 나우어지면 윤년이다.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt(); // 키보드로부터 연도를 입력받음.
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {     // 입력받은 연도가 4의 배수인 경우,
             System.out.println(year + "년은 윤년 입니다."); // 참인 경우 수행
        }
        else {
             System.out.println(year + "년은 윤년이 아닙니다.");// 거짓인 경우 수행
        }

    }
}
