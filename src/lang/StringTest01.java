package lang;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//문자 "escape \
		
		String s="I say \"Hello\"";
		
		System.out.println(s);
		
		
		char c='\'';
		
		//문자 "escape \를 출력하고 싶을때 
		
		String s1="C:\\jx372";
		
		//\t, \n,\r을 출력하고 싶을때
	
		System.out.print("\n"); //2개는 동일함 
		System.out.println("");
		
		
		//+ 연산이 가능하다. 
		String s4= "Hello"+"World";
		System.out.println(s4);
		System.out.println(s4.charAt(4));
		
		//내부 문자(배)열을 가져오기 
		
		char[] cs=s4.toCharArray();
		System.out.println(cs);
		
		
		
		
		
		
	}

}
