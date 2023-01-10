package 문자열다루기;
// String 다루기
public class StringEx {
    public static void main(String[] args) {
        // equals() : 두 개의 문자열이 동일 여부를 비교하여 결과를 반환
        String a = "hello";
        String b = "Java";
        String c = "hello";
    //    System.out.println(a.equals(b)); // a문자열과 b문자열을 비교해서 결과가 같으면 true, 틀리면 false
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분하지 않고 입력된 단어와 맞는지만 확인
//        System.out.println(a == c);

        // indexOf() : 문자열에서 특정 문자가 시작되는 index 값을 반환. (인덱스는 0부터 시작)
        String d = "Hello Java";
        System.out.println(d.indexOf("Java")); // index 값 6을 출력

        // contains() : 문자열에서 특정 문자열 포함여부를 반환. 대소문자를 구분한다.
        System.out.println(d.contains("Java"));

        // charAt() : 문자열에서 index에 해당하는 문자를 반환.
        String str = "Hello Java";
        System.out.println(str.charAt(6));

        // replace(), replaceAll() : 문자열에서 특정 문자열을 다른 문자열로 대체할 때 사용
        System.out.println(str.replace("Java", "Python"));
        String str1 = "Apple, Banana, Pineapple, Kiwi, Melon";
        System.out.println(str1.replace("Pineapple", "Orange"));

        // substring(시작인덱스) : 문자열에서 특정 문자를 추출할 때 사용
        // substring(시작인덱스에서 종료인덱스)
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(7,12));  // 시작 인덱스부터 종료 인덱스 미만까지

        // toUpperCase() / toLowerCase() : 문자열을 전부 대문자 / 소문자로 변경
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // trim() : 문자열의 앞 뒤의 공백을 제거
        String str2 = " 자바   기반     공동데이터 과정           입니다.     ";
        System.out.println(str2.trim());

        // split() : 문자열을 특정 구분자 기준으로 분리하는 메소드
        String str3 = "안유진/카즈하/유나/장원영";
        String[] result = str3.split("/"); // 입력 받은 이름을 공백 기준으로 나누어 담음
        for(String e : result) System.out.println(e + " ");

        // 문자열 포매팅 : String.format(), System.out.printf()
        // 문자열 내에서 서식을 이용해 값을 삽입하는 방법
        System.out.printf("오늘의 온도는 %d 입니다.\n", 10);
        String str4 = String.format("오늘의 온도는 %d 입니다.\n", 10);
        System.out.print(str4);

        // toCharArray() : 문자열을 문자 배열로 반환
        char[] word = str3.toCharArray();
        for(int i = 0; i < word.length; i++) {
            System.out.print(word[i] + ",");
        }

    }
}
