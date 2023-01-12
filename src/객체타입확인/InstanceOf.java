package 객체타입확인;
// instanceof : 객체타입을 확인하는 연산자
//              상속 관계에서 부모와 자식 관계가 성립하는지 확인하는 용도로 사용
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); // parent 가 Parent 로부터 만들어졌는지 확인 => true
        System.out.println(child instanceof  Parent); // child 가 Parent 로부터 만들어졌는지 확인 => true
        System.out.println(parent instanceof  Child); // parent 는 Child 로부터 만들어진것이 아님 => false
        System.out.println(child instanceof  Child); // child 가 Child 로부터 만들어졌는지 확인 => true
    }
}

class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String name;
    Child(String name) {
        super("부모"); // 부모 생성자를 호출, 부모와 자식 클래스에 생성자가 생성되어있는데
                            // super 설정을 안하면 어느 클래스 매개변수에 값을 넣을지 순서를 모르기 때문에 에러가 난다.
        this.name = name;
    }

}