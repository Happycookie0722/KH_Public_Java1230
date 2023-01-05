package 참조타입;

public class RefType {
    public static void main(String[] args) {
        // int[] x = null; // 참조하는 객체가 없다는 의미
        String nameVal1 = "장욱";  // 컴파일 할 때 static 영역에 박제돼 있음.
        String nameVal2 = "장욱";
        String nameVal3 = new String("장욱"); // stack 에 있는 nameVal3 는 Heap 영역에 있는 "장욱" 의 주소를 표시.

        if(nameVal1 == nameVal3) {
            System.out.println("nameVal1과 nameVal3가 참조가 같음");
        }
        else {
            System.out.println("nameVal1과 nameVal3가 참조가 다름");
        }
        if(nameVal1.equals(nameVal3)) {
            System.out.println("nameVal1과 nameVal3가 내용이 같음");
        }
    }
}
