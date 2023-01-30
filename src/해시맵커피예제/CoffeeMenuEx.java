package 해시맵커피예제;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// HashMap : 키(Key)와 값(Value)의 pair 로 구성 된 형태
// 동일 여부 판단을 HashCode 를 통해서 한다.
// Key 는 중복 허용을 하지 않음, 단 값은 중복 허용을 한다.
// 순서를 보장하지 않는다.

public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {

        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();


    }
    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피 입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 들어있어요."));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";
        while(true) {
        System.out.print("[1] 메뉴보기 [2] 메뉴조회 [3] 메뉴추가 [4] 메뉴삭제 [5] 메뉴수정 [6] 종료 : ");
        int selMenu = sc.nextInt();
        switch(selMenu) {
            case 1:
                System.out.println("======== 메뉴 보기 ========");
                for(String e : map.keySet()) { // 키 값으로 향상 된 for 문을 반복 수행
                    System.out.println("메뉴 : " + map.get(e).name); // 키로 해당 값을 얻어냄
                    System.out.println("가격 : " + map.get(e).price);
                    System.out.println("분류 : " + map.get(e).group);
                    System.out.println("설명 : " + map.get(e).desc);
                    System.out.println("========================");
                }
                break;
            case 2:
                System.out.println("조회 할 메뉴를 입력하세요 : ");
                key = sc.next();
                if(map.containsKey(key)) { // 매개변수로 전달 된 키가 map 내에 존재하는지 여부를 확인
                    System.out.println("메뉴 : " + map.get(key).name);
                    System.out.println("가격 : " + map.get(key).price);
                    System.out.println("분류 : " + map.get(key).group);
                    System.out.println("설명 : " + map.get(key).desc);
                    System.out.println("========================");
                } else {
                    System.out.println("해당 메뉴가 없습니다.");
                }
                break;
            case 3:
                System.out.print("추가 할 메뉴를 입력하세요. : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    System.out.println("해당 메뉴가 이미 존재합니다.");
                } else {
                    System.out.print("가격 : ");
                    int price = sc.nextInt();
                    System.out.print("분류 : ");
                    String group = sc.next();
                    sc.nextLine();
                    System.out.print("설명 : ");
                    String desc = sc.nextLine();
                    map.put(key, new MenuInfo(key, price, group, desc)); // 키와 값(객체)을 추가 함
                }
                break;
            case 4:
                System.out.println("삭제할 메뉴를 선택하세요. : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    map.remove(key); // 키로 해당하는 map 의 entry 제거
                    System.out.println("메뉴를 삭제하였습니다.");
                } else {
                    System.out.println("삭제할 메뉴가 없습니다.");
                }
            case 5:
                System.out.println("수정할 메뉴를 선택하세요 : ");
                key = sc.next();
                if(map.containsKey(key)) {
                    System.out.print("가격 입력 : ");
                    int price = sc.nextInt();
                    System.out.print("분류 입력 : ");
                    String group = sc.next();
                    sc.nextLine();
                    System.out.print("별명 입력 : ");
                    String desc = sc.next();
                    map.replace(key, new MenuInfo(key, price, group, desc));
                } else {
                    System.out.println("수정할 메뉴가 없습니다.");
                }
                break;
            case 6: System.out.println("메뉴를 종료 합니다."); return;
            default:
                System.out.println("없는 메뉴입니다. 메뉴를 다시 선택하세요."); break;
            }
        }


    }
}
