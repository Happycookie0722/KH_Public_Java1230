package 접근제한자;

public class ParentRest {
    public String name; // default 접근제한자
    protected String money;
    protected String addr;
    public ParentRest() {
        this.name = "곰돌이사육사";
        this.money = "100억";
        this.addr = "경기도 수원시";
    }
}
