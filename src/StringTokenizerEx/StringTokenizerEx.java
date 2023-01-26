package StringTokenizerEx;
import java.util.StringTokenizer;
import java.util.Scanner;

// StringTokenizer : 구분자 기준으로 문자열을 나눠담는 것, String 의 split() 메소드와 유사
// countTokens() : 꺼내지 않고 남아 있는 토큰의 수
// hasMoreTokens() : 남아있는 토큰이 있는지 확인 (있으면 true)
// nextToken() : 남아있는 토큰을 꺼내오는것
public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 연속 입력하세요 : ");

        // Tokenizer 활용

//        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()]; // 나눠진 문자열의 갯수만큼 배열을 확보
//        int idx = 0;
//        while(st.hasMoreTokens()) {
//            nameStr[idx++] = st.nextToken();
//        }
//        for(String e : nameStr) System.out.print(e + " ");

        // split 활용
        String names = sc.nextLine();
        String[] nameArr = names.split("/");
        for(String e : nameArr) System.out.print(e + " ");
    }
}
