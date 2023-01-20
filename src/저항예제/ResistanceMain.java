package 저항예제;

import java.util.Scanner;

public class ResistanceMain {
    public static void main(String[] args) {
        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "gray", "white"};
        int fst = 0, sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        String fstColor = sc.next();
        String secColor = sc.next();
        String thdColor = sc.next();
        for(int i = 0; i < colorArr.length; i++) {
            if(fstColor.equals(colorArr[i])) fst = i;
            if(secColor.equals(colorArr[i])) sec = i;
            if(thdColor.equals(colorArr[i])) thd = i;
        }
        System.out.println((long)((fst * 10) + sec) * (long)(Math.pow(10, thd)));
    }
}
