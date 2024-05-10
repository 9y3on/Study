package day0704;

import java.util.Calendar;

public class UseWork0704 {
	
	//3번
	public void UseSelectCalendar() {
		Work0704 w = new Work0704();
		int year = 1999, month = 9;
		String[][] calendar = w.selectCalendar(year, month);

		System.out.printf("\t\t     %d년 %d월\n일\t월\t화\t수\t목\t금\t토\n",year,month);
		
		for(String[] week : calendar) {
			for(String day : week) {
				System.out.print(day);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//1번
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 6);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);		
		
		System.out.print("\t\t     2023년 7월\n일\t월\t화\t수\t목\t금\t토\n");
		
		for(int i = 1, day = 1; day < lastDay+1; i++) {
			if(i < firstDay) {
					System.out.print("\t");
			} else {
				System.out.printf("%d\t",day);				
				day++;
				if(i%7 == 0) System.out.println();	
			}
		}
		
		System.out.print("\n\n");
		
		//2~3번
		new UseWork0704().UseSelectCalendar();
		
	}
}
