package 기본for문;
// for(초기식; 조건식; 증감식) { }
public class ForEx1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {  // i가 1부터 100이 될 때까지 반복
            System.out.printf("%4d", i); // i를 4칸마다 출력되도록 사용
            if(i % 10 == 0) System.out.println();
        }
        System.out.println();



        int i = 1;
        for(;;){
            System.out.printf("%4d",i);
            if(i % 10 == 0) System.out.println();
            if(i == 100) break;
            i++;
        }
        System.out.println();

        // 두 개의 방식은 다르지만 출력되는 값은 같다.
    }
}
