package 변수의사용범위;
//변수의 생존 범위는 { } 의 범위에 따른다.
public class VarScope {
    public static void main(String[] args) {
        int value = 10; // 지역 변수
            if(value == 10) {   // { } 내부에 사용된 변수는 내부에서만 사용 후 사라진다.
            int tmp = 20;
            value = tmp + value;
            System.out.println(tmp);
        }

    }
}
