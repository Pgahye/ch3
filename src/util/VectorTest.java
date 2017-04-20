package util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		//순회 
		int count=v.size();
		
		for(int i=0;i<count;i++){
			
			String s=v.elementAt(i);
			System.out.println(s);
		}
		
		
		v.removeElementAt(1);
		
		//순회2
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()){
			
			String s=e.nextElement();
			System.out.println(s);
			
		}
		
		

	}

}
