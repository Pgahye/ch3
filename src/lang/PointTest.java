package lang;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Point pt=new Point();
			System.out.println(pt.getClass().getName());
			System.out.println(pt.hashCode()); //객체ID, 객체 레퍼런스값을 의미
			//toString()은 getClass().getName() + "@" + hashCode() 으로 되어있음 
			System.out.println(pt.toString());
			System.out.println(pt);
			
			//string 객체와 비교 
			
			String s=new String("hello");
			System.out.println(s.getClass().getName());
			System.out.println(s.hashCode());
			System.out.println(s.toString());
			System.out.println(s);
			
			
	}

}
