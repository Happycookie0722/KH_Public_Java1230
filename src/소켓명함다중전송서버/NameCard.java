package 소켓명함다중전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String phone;
    String Company;
    String mail;

    public NameCard(String name, String phone, String company, String mail) {
        this.name = name;
        this.phone = phone;
        Company = company;
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
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
