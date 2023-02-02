package 예외처리예제7;

import java.util.Scanner;
import java.util.zip.Checksum;

// 예외처리 구문은 사용자가 정의해서 사용도 가능하다
public class Exception7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckEven checkEven = new CheckEven();
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        try {
            System.out.println(checkEven.printEven(num));
        } catch (EvenException e) {
            e.printStackTrace();
        }
    }
}

class EvenException extends Exception {
    private Integer number = null;
    public EvenException(int number) {
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) {
            return "숫자가 아닙니다.";
        } else {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}

class CheckEven {
    private int num;
    void setNumber(int num) {
        this.num = num;
    }
    int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0) {
            throw new EvenException(num);
        } else {
            return num;
        }
    }
}