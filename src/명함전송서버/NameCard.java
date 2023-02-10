package 명함전송서버;
// 1. 명함 정보를 담을 클래스 생성 (이름, 전화번호, 이메일, 주소)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락
// 명함 전송 여부를 물어봄 (전송하시겠습니까? Yes / No)
// 4. 클라이언트는 서버에서 전송한 명함 정보를 출력하기

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String phone;
    String company;
    String mail;

    public NameCard(String name, String phone, String company, String mail) {
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
