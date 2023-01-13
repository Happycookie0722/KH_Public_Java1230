package 슈퍼변수와슈퍼메소드;
// super : 자식 클래스가 부모 클래스로부터 상속 받은 필드를 참조할 때 사용하는 참조 변수
public class SuperMethod {
    public static void main(String[] args) {
        System.out.println("메인 메소드 호출");
        Child child = new Child();
        child.display();
    }
}
class Parent {
    int a;
    Parent() {
        a = 10;
        System.out.println("부모 생성자 호출");
    }

    Parent(int n) {
        a = n;
    }
}
class Child extends Parent {
    int b;
    Child() {
//        Child 객체 생성시에 Parent() 생성자를 먼저 호출한다
        b = 20;
        System.out.println("자식 생성자 호출");
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

