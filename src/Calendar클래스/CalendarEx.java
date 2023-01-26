package Calendar클래스;

import java.util.Calendar;

// Calendar 클래스는 추상 클래스이므로 객체를 생성할 수 없음, 정적 메소드인 getInstance() 메소드로 운영체제의 시간을 가져옴
// Calendar 클래스에 포함된 모든 필드는 정적 변수(클래스 변수)임
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date(); 와 같음
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 달의 정보는 배열의 인덱스로 넘어오기 때문에 1을 더해야 함
//        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 달에서 몇 번째 날짜인지 표시
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇 번째 날짜(일요일부터 시작)
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));

        // yyyy년MM월dd일 HH시mm분ss초 형태를 Calendar로 출력
        StringBuffer sb = new StringBuffer();
        sb.append(now.get(Calendar.YEAR) + "년 ");
        sb.append((now.get(Calendar.MONTH)+1) + "월 ");
        sb.append(now.get(Calendar.DAY_OF_MONTH) + "일 ");
        sb.append(now.get(Calendar.HOUR) + "시 ");
        sb.append(now.get(Calendar.MINUTE) + "분 ");
        sb.append(now.get(Calendar.SECOND) + "초");
        System.out.println(sb);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, month, day, hour, min, sec);


    }
}
