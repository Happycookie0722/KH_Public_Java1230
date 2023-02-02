package 게임만들기;
// 추상클래스를 생성했기 떄문에 객체 생성이 안됨
// 상속을 주기 위해서 접근제한자는 protected(상속관계, 같은 패키지 접근 가능)
abstract public class Unit {
    protected String name; // 캐릭터 이름
    protected int pPower; // 피지컬 파워
    protected int mPower; // 매지컬 파워
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기
    protected int hp; // 체력
}
