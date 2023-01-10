package StringKMP;
//입력 : Knuth-Morris-Pratt
//출력 : KMP
//입력 : Mirko-Slavko
//출력 : MS

import java.util.Scanner;

public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 : ");
        String name = sc.next();

        // 첫번째 방법 : split() 메소드를 이용하는 방법

        /*

        String[] splitName = name.split("-"); // "-" 기준으로 문자열을 작은 문자열로 만듦
        for(String e : splitName) {
            System.out.print(e.charAt(0));
        }

         */

        // 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법

        /*

        String[] splitName = name.split("-");
        for(int i = 0; i < splitName.length; i++) {
            System.out.print((splitName[i].charAt(0)));
        }

        */

        // 세번째 방법 : 0번째 문자를 출력하고 '-'이후 문자를 출력하는 방법

        /*

        for(int i = 0; i < name.length(); i++) {
            if(i == 0) {
                System.out.print(name.charAt(i));
            }
            else {
                if(name.charAt(i) == '-') {
                    System.out.print(name.charAt(i+1));
                }
            }
        }

         */

        // 네번째 방법 : 문자 배열로 변경 후 출력하는 방법


        char[] nameArr = name.toCharArray();
        for(int i = 0; i < name.length(); i++) {
            if (nameArr[i] >= 'A' && nameArr[i] <= 'Z') {
                System.out.print(nameArr[i]);
            }
        }


    }
}
