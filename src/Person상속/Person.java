package Person상속;

public class Person {
    int age;
    int sleep;
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void setSleep(int time) {
        this.sleep = time;
    }
    int getSleep() {
        return sleep;
    }
}

class Worker extends Person {
    int work;
    void setWork(int time) {
        this.work = time;
    }
    int getWork() {
        return work;
    }
}

class Student extends Person {
    int study;
    void setStudy(int time) {
        this.study = time;
    }
    String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }
}
