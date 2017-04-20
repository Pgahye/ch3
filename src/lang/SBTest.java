package lang;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성
		StringBuffer sb=new StringBuffer("This");
		
		System.out.println(sb);
		
		//문자열추가
		
		sb.append("is pencil");
		System.out.println(sb);
		
		//삽입
		sb.insert(7, "My");
		System.out.println(sb);
		
		//치환
		sb.replace(8, 10, "yours");
		System.out.println(sb);
		
		//버퍼 크기 조정
		
		sb.setLength(3);
		System.out.println(sb);
		
		//더중요한 내용
		//문자열+연산은 내부적으로 스트링버퍼 객체로 변환된다. 
		
		String s1="Hello"+"World"+10+true;
		
		String s2=new StringBuffer("Hello").append("World").append(10).append(true).toString();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
	}

}
