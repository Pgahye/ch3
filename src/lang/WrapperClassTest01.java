package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer i= new Integer(10);
		
		Character c= new Character('c');
		
		Float f=new Float(3.14);
		
		Boolean b=new Boolean(true);
		
		//Auto Boxing
		// 상수풀을 거쳐서 자동으로 new integer(10)
		Integer j=10;
		
		//int k=10 +j.intValue();
		//Auto unBoxing
		int k=20 +j;
		
		swap(i,j);
		
	}
	public static void swap(Integer i,Integer j){
		
		//객체이지만 내부를 수정할수없기 때문에 swap되지 않는다. 
		
	}

}
