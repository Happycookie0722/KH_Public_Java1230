package 로또만들기응용;
// 7자리의 로또 번호 만들기
// 첫번째부터 여섯번째 숫자는 0 ~ 50 사이의 랜덤값, 마지막 숫자는 50 ~ 100 사이의 임의의 숫자
// 배열을 사용해서 값을 구하고 출력하기, 단 중복은 허용
public class LottoApplyEx {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for(int i = 0; i <= 6; i++) {
            arr[i] = ((int)(Math.random() * 51));
        }
        while(true) {
            int tmp = ((int) (Math.random() * 101));
            if (arr[6] >= 50 && arr[6] <= 100)  break; arr[6] = tmp;
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
