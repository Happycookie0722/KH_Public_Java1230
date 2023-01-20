package 단어공부;

import java.util.Scanner;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내기
// 단, 가장 많이 사용된 알파벳이 여러개인 경우 "?" 출력
// 가장 많이 사용된 알파벳 출력시 대문자로 출력
// mississipi => ?
// zZa => Z
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 숫자만큼의 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next();
        int max = 0;
        char result = 0;
        for(int i = 0; i < word.length(); i++) {  // aabb
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?';
            else if(alphabet[i] > max) {
                max = alphabet[i];
                result = (char)('A' + i);
            }
        }
        System.out.println(result);
    }
}
