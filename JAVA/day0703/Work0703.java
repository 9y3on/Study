package day0703;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Work0703 {
	
	private int flag;

	//1번
	public String[] dataTokenizer(String csvData) {
		StringTokenizer csvToken = new StringTokenizer(csvData,"김 ,.~");
		String[] csvArr = new String[csvToken.countTokens()];
		String data = "";
		int i = 0;
		
		while(csvToken.hasMoreTokens()) {
			data = csvToken.nextToken();
			csvArr[i] = data;
			i++;
		}//end while
		
		return csvArr;
	}
	
	
	//2번
	public String date() {
		Locale[] locale = {Locale.KOREA, Locale.US, Locale.JAPAN, Locale.CANADA};

		if(!(flag > -1 && flag < 4)) {
			flag = 0;
		}//end if
		
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a EEEE",locale[flag]).format(new Date());
	}//date
	
	public void getDate(int flag) {
		this.flag = flag;
		System.out.println(date());
	}

}//class
