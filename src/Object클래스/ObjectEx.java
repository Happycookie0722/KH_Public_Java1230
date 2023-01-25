package Object클래스;

public class ObjectEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        // 해당 인스턴스의 정보를 문자열로 반환
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        // student1 과 student2 가 참조하고 있는 주소가 같은지 묻는것
        // equals()는 해당 객체를 매개변수로 전달 받아 참조변수와 비교하여 결과를 반환
        student2 = student1;
        System.out.println(student1.equals(student2));
    }
}
// 상속을 받지 않았더라도 기본적으로 Object 클래스로 부터 상속을 받음
// Object 클래스는 toString(), equals(), clone(), hashCode() 등의 메소드를 포함하고 있음.
class Student extends Object {
    int id;
    String name;
}