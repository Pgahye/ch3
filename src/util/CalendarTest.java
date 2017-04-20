package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance(); //추상이라서 바로 생성이 안됨 , 팩토리패턴?? 싱글을 유지하기 위해 객체 생성을 할수가 없음 
		printDate(cal);
		
		//특정날짜 세팅하기
		
		cal.set(Calendar.YEAR, 2007);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DATE, 12);
		//cal.set(2007,10,12); 위와 똑같음
		
		//기념일
		cal.add(Calendar.DATE, 1000);
		
		
		
		
		printDate(cal);
	}
	
	public static void printDate(Calendar cal){
		
		String[] days={"일","월","화","수","목","금","토"};
		int year=cal.get(Calendar.YEAR);
		
		
		int month=cal.get(Calendar.MONTH); //0-11월까지 

		
		int date=cal.get(Calendar.DATE);
		
		int day=cal.get(Calendar.DAY_OF_WEEK);
		
		int am = cal.get(Calendar.AM_PM);
		
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		
		System.out.println(year + "년" + (month+1) + "월"+ date+ "일" + days[day-1] + "요일"+ hour+ "시"+ min +"분"+ sec +"초"+ 
		am);
		

		
		
		
	}

}
