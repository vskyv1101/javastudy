package java0320;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest{
	public static void main(String[] args) {
		System.out.println("CalendarTest");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = scanner.nextInt();
		System.out.println("월 입력 : ");
		int month = scanner.nextInt();
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 1);

		int startWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("startWeek:" + startWeek);
		int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		String weekNames[] = {"일","월","화","수","목","금","토"};
		
		
		System.out.println(calendar.getTime());
		System.out.println(dayOfMonth);
		
		for (String weekName : weekNames) {
			System.out.print(weekName + "\t");
		}
		
		System.out.println();
		
		int step = 0;
		
		for ( int i = 1; i <= startWeek - 1; i++) {
			System.out.print("\t");
			
			step++;
		}
		
		for ( int i = 1; i <= dayOfMonth; i++) {
			step++;
			System.out.print(i + "\t");
			if ( i % 7 == 0) {
				System.out.println();
			}
		}
			
		
	}

}
