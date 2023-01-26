package Class클래스;

public class ClassMainEx {
    public static void main(String[] args) throws ClassNotFoundException {
//        String s = new String();
//         Class c = s.getClass(); // 클래스 정보를 읽어 클래스 타입으로 반환
//         Class c = String.class;
//         Class c = Class.forName("java.lang.String");
//        System.out.println(c);

        Person person = new Person();
        Class pCls1 = person.getClass(); // Object 의 getClass() 메소드 사용
        System.out.println(pCls1.getName());

        Class pCls2 = Person.class; // 직접 class 대입하여 사용
        System.out.println(pCls2);
    }
}

class Person {
    private String name;
    private int age;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
