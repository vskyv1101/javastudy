package java0327;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int getRandomNumber (int start, int end) {
        Random random = new Random();
        int value = random.nextInt(999999) + 1;

        return value;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("태어난 연도를 입력해 주세요 : ");
        int year = scanner.nextInt();

        System.out.println("태어난 월을 입력해 주세요 : ");
        int month = scanner.nextInt();

        System.out.println("태어난 일을 입력해 주세요 : ");
        int day = scanner.nextInt();

        System.out.println("성별을 입력해 주세요 : (M/F) ");
        String gender = scanner.next();

        // Logic
        StringBuilder sb = new StringBuilder();

        String jumin = String.format("%s%02d%02d-%d%06d"
                , String.valueOf(year).substring(2)
                , month
                , day
                , "f".equalsIgnoreCase(gender) ? 4 : 3
                , getRandomNumber(1, 999999));
        sb.append(jumin);

        // Output
        System.out.println(sb.toString());

        System.out.println(year + "," + month +"," + day +"," + gender);


    }
}