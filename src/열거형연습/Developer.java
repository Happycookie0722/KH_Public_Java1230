package 열거형연습;

public class Developer {
    private String name;
    private DevType type; // DevType 클래스 중 정해진 타입으로만 입력받음
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.printf("이름 : " + name);
        System.out.printf("경력 : " + career);
        System.out.printf("업무 : " + type);
        System.out.printf("성별 : " + gender);
    }
}
