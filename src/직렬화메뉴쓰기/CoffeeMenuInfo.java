package 직렬화메뉴쓰기;

import java.io.Serializable;

public class CoffeeMenuInfo implements Serializable {
    String name;
    int price;
    String group;
    String desc;

    public CoffeeMenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getGroup() {
        return group;
    }

    public String getDesc() {
        return desc;
    }
}
