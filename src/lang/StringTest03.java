package lang;

public class StringTest03 {

	
	public static void main(String[] args) {
		
		
		String s = "abcABcabcABC";

		// charAt
		System.out.println(s.charAt(2));

		// indexof

		System.out.println(s.indexOf("ABc"));
		System.out.println(s.indexOf("D"));

		// replace

		System.out.println(s.replace('a', 'r'));
		System.out.println(s); // 기존것은 바뀌지 않음

		// replaceall

		System.out.println(s.replace("bc", "12"));
		System.out.println(s.replaceAll("bc", "12"));

		// subString

		System.out.println(s.substring(3, 7)); // 3부터 7번째 앞까지 잘라라
		
		//tolowercase
		System.out.println(s.toLowerCase());
		
	
		String str1=" ab cd ";
		String str2=" ,efg";
		
		//concat
		str1=str1.concat(str2);
		System.out.println(str1);
		
		//trim
		
		System.out.println("--"+str1+"--");
		str1=str1.trim();
		System.out.println("--"+str1+"--");// 가운데 공백제거는 하지않음 , 모든 공백제거는??
		
		//split
		
		String[] tokens=str1.split(",");
		
		for(String str: tokens){
			
			
			System.out.println(str);
		}
		
		//split 예외 
		
		tokens="abcdefg".split(",");
		for(String str: tokens){
			
			
			System.out.println(str);
		}
		tokens="         ".split(",");
		for(String str: tokens){
			
			
			System.out.println(str);
		}
		System.out.println(tokens.length);
		
		
	}
	
	
}
