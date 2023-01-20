package 인터페이스활용;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.print("구매하기");
    }
    @Override
    public void sell() {
        System.out.print("판매하기");
    }
}
