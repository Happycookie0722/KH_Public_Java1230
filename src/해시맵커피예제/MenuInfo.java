package 해시맵커피예제;

public class MenuInfo {
    String name; // 메뉴이름
    int price;   // 메뉴가격
    String group;// 메뉴 카테고리
    String desc; // 메뉴에 대한 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
}

//enum MenuName {
//    AMERICANO, ESPRESSO, LATTE, COLDBREW, MOCHA,
//}
