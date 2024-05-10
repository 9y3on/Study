package day0704;

import java.util.Calendar;

public class Work0704 {	
		
	private Calendar cal;
	private String[][] calendar;
	public Work0704() {
		cal = Calendar.getInstance();
	}
	
	//2번
	public String[][] selectCalendar(int year, int month){
		cal.set(year, month-1, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); //firstDayOfWeek, 1일의 요일
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막 날
		setCalendarArr(lastDay);
			
		for(int i = 0, j = 1, day = 1; day < lastDay+1; j++) {	
			if(j < firstDay) {
				calendar[i][j-1] = "\t";
			} else {
				calendar[i][(j-1)%7] = String.valueOf(day).concat("\t");					
				day++;
				if(j % 7 == 0) i++;
			}		
		}
		
		return calendar;
	}
	
	//배열 길이 설정
	public void setCalendarArr(int lastDay){
		cal.set(Calendar.DAY_OF_MONTH,lastDay);
		int lastWeek = cal.get(Calendar.WEEK_OF_MONTH); //마지막 주
		int lastDayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //마지막 요일
		calendar = new String[lastWeek][];
		//calendar[lastWeek-1] = new String[lastDayOfWeek];
		
		for(int i = 0; i < calendar.length; i++) {
			calendar[i] = i == lastWeek-1 ? new String[lastDayOfWeek] : new String[7];
		}	
		
	}

}
