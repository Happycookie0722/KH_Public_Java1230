package 다형성기본;
// 부모 클래스의 타입의 참조변수로 자식 클래스의 인스턴스를 참조
// 단, 부모클래스에서 존재하는 메소드만 접근 가능
public class BasicPoly {
    public static void main(String[] args) {
        Child child = new Child(); // 자식클래스(Child : 클래스 타입) 의 참조 변수(child) 로 자식클래스의 인스턴스(객체 : Child()) 참조
        child.display();
        child.out();

        Parent parent = new Child();
        parent.display();
        ((Child)parent).out();  // 형변환하면 접근 가능하다.
    }
}
