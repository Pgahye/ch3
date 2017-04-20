package lang;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point pt1=new Point(10,20);
		Point pt2=new Point(10,20);
		Point pt3=pt2;
		
		//Point 객체 비교, equals, hashcode 메소드가 오버라이드 안된 경우!!! 
		
		// == 연산자에서 두개의 항이 객체 참조 변수인 경우
		// 두 객체의 동일 여부 (동일성)
		System.out.println(pt1 == pt2);
		System.out.println(pt2 == pt3);
		
		
		//두 객체의 동질성 비교를 할때에는 equals메소드를 사용한다. 
		//equals가 오버라이드가 안된경우에는 ==와 동일하다. 
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		
		
		
		//String 객체비교 , equals 와 hashcode 메소드가 오버라이드 된 경우!!
		
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		
		 //hashcode 출력
		//String클래스는 내용기반으로 hashcode를 생성하게
		//hashcode 메소드가 오버라이드 되어있다. 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		//참조값 (객체ID) 출력
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//리터럴을 사용하는 경우
		// JVM안의 리터럴(상수) 풀에서 객체 생성 관리를 하기 때문에 문자열 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다. 
		
		String str1="hello";
		String str2="hello";
		
		String str3=str2;
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		
	}

}
