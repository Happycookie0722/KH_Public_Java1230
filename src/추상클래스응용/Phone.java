package 추상클래스응용;
// 추상 클래스 만들기
// 일반 필드와 메소드를 포함 할 수 있음.
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) {
        this.name = name;
    }
    void setPower(boolean power) {
        this.isPower = power;
        if(isPower) {
            System.out.println("Phone Power On");
        }
        else {
            System.out.println("Phone Power Off");
        }
    }
    abstract void call(); // 상속 받은 클래스에서 반드시 오버라이딩 해서 기능을 완성해야함.
}
