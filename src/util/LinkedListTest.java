package util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//삽입
				List<String> list=new LinkedList<String>();		
				list.add("둘리");
				list.add("마이콜");
				list.add("도우넛");
				
				//순회
				int count=list.size();
				
				for(int i=0;i<count;i++){
					String s=list.get(i);
					System.out.println(s);
				}
				
				//삭제
				list.remove(1);
				
				
				//순회2
				Iterator<String> it=list.iterator(); //한번 돌면 끝임
				
				while(it.hasNext()){
					
					String s=it.next();
					System.out.println(s);
					
				}
				
				//순회3
				for(String s:list){
					
					System.out.println(s);
				}
				
				
				
	}

}
