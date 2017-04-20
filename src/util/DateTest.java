package util;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Date now=new Date();
			
			System.out.println(now);
			printDate(now);
			printDate2(now);
			
			
			//특정시간 세팅 (2000,4,21)
			Date d2=new Date(100,3,21);
			printDate(d2);
			
			//특정시간 세팅 (2000,4,21, 13시 25분 30초)
			Date d3=new Date(100,3,21,13,25,30);
			
			//1970년 1월 1일 00시00분00.ooo초
			//milliseconds 값을 세팅
			
			long milliseconds=24*60*60*1000*365*30;
			Date d4=new Date(milliseconds);
			printDate(d4);
			
			
			
			
			
	}
	
	public static void printDate(Date date){
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 a dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(date));
		
		
	}
	
	public static void printDate2(Date d){
		//년도(+1900)
		int year=d.getYear();
		
		System.out.println(year+1900+"년");
		//0~ 11로 나옴
		int month=d.getMonth();
		System.out.println(month+1+"월");
		
		int date=d.getDate();
		System.out.println(date+"일");
		
		int hour=d.getHours();
		System.out.println(hour+"시");
		
		int minutes=d.getMinutes();
		System.out.println(minutes+"분");
		
		int seconds=d.getSeconds();
		System.out.println(seconds+"초");
		
	}

}
