package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screen; // 화면 크기가 11인치, 12.9인치
    int color;  // 색상 :
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : Wi-Fi, Wi-Fi+Cellular
    String name; // 각인 서비스 신청 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum; // 제품의 일련번호 : iPad13128C2301111
    static int cnt = 0; // 클래스 변수 (객체 생성 시 생성되지 않고 클래스에 소속된 변수)

    IPadPro(String name) {  // 생성자 : 객체가 만들어 질 때 호출
        this.name = name;
        Date now = new Date(); // 시간정보를 가져오기 위해 Date 클래스를 객체로 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // m = 시간의 minute M = Month
        productDate = sdf.format(now); // now 의 시간 값을 가져온 뒤 변수 sdf 의 설정된 포맷(yy년MM월dd일)대로 대입
        cnt++;
        productDate += cnt;
    }
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구매하기 ====");
        System.out.println("구입하시려면 Yes / 종료는 Quit : ");
        String isProduct = sc.next();
        if(isProduct.equalsIgnoreCase("Yes")) return true;
        else return false;
    }

    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1] 11인치 [2] 12.9인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하세요.");
        }
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("색상 선택 [1] 스페이스 그레이 [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택하세요.");
        }
    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("용량 선택 [1] 128GB [2] 256GB [3] 512GB [4] 1TB : ");
            memory = sc.nextInt();
            if (memory >= 1 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요.");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1] Wi-Fi [2] Wi-Fi + Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }

    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? yes / no :");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력하세요 : ");
            name = sc.next();
        }
    }

    // 시리얼 넘버 : 제품의 고유번호이며 제품마다 유일한 값을 가져야한다.
    // IPad + 11 / 13 + 128/256/512/1024 + W/C + 230111 + 생산대수
    void setSerialNum() {
        String scrStr = (screen == 1)? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "IPad" + scrStr + memStr[memory] + netStr + productDate;
    }

    // 제품 구매가 완료되면 출고까지 30초가 소요된다.
    void inProductionPad() throws InterruptedException {
        int cnt = 0;
        while(true) {
            sleep(300); // 0.3초
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }

    void viewProductPad() {
        final String[] screenType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1024"};
        final String[] netType = {"", "Wi-Fi", "Wi-fi+Cellular"};
        System.out.println("===== iPad Pro가 출고 되었습니다. =====");
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 컬러 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("===================================");

    }
}
