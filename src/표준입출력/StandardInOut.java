package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 수원시";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;

        // 자바 스타일 (print() / println() 메소드 오버로딩을 이용하므로 따로 서식을 넣을 필요 없음.)
        System.out.println("==== 자바 스타일 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3));

        // C언어 스타일 (서식 지정자와 이스케이프 시퀀스 사용)
        // 서식 지정자 : %d, %f, %.2f, %2d(앞에 2칸을 비운 후 정수 출력), %s, %c, %b, %%
        // 이스케이프 시퀀스 : \n, \r, \t, \b, \\
        System.out.printf("===== C 스타일 =====\n"); // \n : 줄바꿈
        System.out.printf("이름 : %s\n", name); // %s String 문자열 사용
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender); // %c char 문자 사용
        System.out.printf("나이 : %d\n", age); // %d 정수 출력
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3); // %.2f 소수점 2자리까지 실수 출력

        // \n : 줄바꿈
        // \r : 커서를 앞으로 이동후 덮어씌우기 insert 와 유사하다.
        // \b : backspace 와 같음.
        // \t : tap 과 같음.
        // \"\" : 문자열 출력에 ""을 출력하고 싶은 경우에 사용.
        // \\ : \ 를 넣을 경우에 사용.

        System.out.println("\"Enter\"키를 입력 하시면 종료 됩니다.");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%입니다.",25);



    }
}
