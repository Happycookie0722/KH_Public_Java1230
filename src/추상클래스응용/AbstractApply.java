package 추상클래스응용;

public class AbstractApply {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S23");
        smartPhone.setPower(true);
        smartPhone.call();
        smartPhone.internet();

        Phone phone = new SmartPhone("Common SmartPhone");
        phone.setPower(true);
        phone.call();
        // phone.internet(); 자식 클래스에서 internet 을 생성했으므로 부모 클래스로 객체를 만들면 사용 불가
    }
}
