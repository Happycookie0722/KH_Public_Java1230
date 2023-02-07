package 소수단어구하기예제;
import java.util.Scanner;
// a를 1로, b를 2로, _, z를 26으로, A를 27로, _, Z를 52로 하여 그 합을 구한뒤
// 합이 소수인지 판별
public class PrimeWordEx {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 알파벳을 더해서 총 숫자의 합을 구하기
        boolean isPrime = true; // 소수 여부를 판별하는 Bool Type 변수 (기본값은 소수)
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1; // 소문자 구간은 1 ~ 26까지
            else sum += word.charAt(i) - 'A' + 1;
        }
        System.out.println(sum); // 각 영어 알파벳을 더해서 총 숫자의 합을 구하기
        // 소수 여부 판별하기
        for(int i = 2; i < sum; i++) {
            if(sum % 2 == 0) isPrime = false;
        }
        if(isPrime) System.out.println("It is a prime word");
        else System.out.println("It is not a prime word");
    }
}
