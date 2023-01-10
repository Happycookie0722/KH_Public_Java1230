package 데이터타입변환;
// 타입변환 : 선언 된 변수의 데이터 타입을 다른 타입으로 변경하는 것.
// 묵시적 타입변환 (자동 타입변환) : 컴파일러가 자동으로 해주며 유리한 방향으로 타입 변환이 이루어진다.
// 명시적 타입 변환 : 개발자가 의도적으로 형을 변경하는 것.
// 메소드를 사용하는 형 변환 : 문자열을 숫자 타입으로 변경이 필요한 경우.
public class ConvType {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = (double)num1 / num2 ;
        double rst2 = 100 + 100.1 ;

        /* String phoneNumber = "010-5006-4146";
        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);  이 상태로 Run 을 하면 오류가 뜨는데, 문자열을 숫자로 바꾸는 도중에 - 는 숫자로 바꿀수 없기 때문에 오류가 발생. */

        String Temp = "36.5";
        double numberTmp = Double.parseDouble(Temp);
        System.out.println(numberTmp);
        /* 형변환 변경 타입 종류
        Byte.parseByte();
        Short.parseShort();
        Integer.parseInt();
        Long.parseLong();
        Float.parseFloat();
        Double.parseDouble();
         */


    }
}
