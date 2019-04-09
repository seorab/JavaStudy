package ch04;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// ���� ��¥�� ���� ������ �ҷ���
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		// �� 0 ~ 11
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int lastDate = c.getActualMaximum(Calendar.DATE);
		int week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(lastDate);
//		System.out.println(week);
//		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(date);
		// �޷��� ��¥�� ������ ������ ����
		c.set(year, month - 1, 1);
		week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
		
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i = 1; i < week; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i <= lastDate; i++, week++) {
			System.out.print(   i < 10 ? " 0"+i : " " + i  );
			if(week % 7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
	}
}








