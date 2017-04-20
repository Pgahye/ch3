package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 소스에 직접 접근한 예제 
		
		
		byte[] src={0,1,2,3,4,5};
		byte[] dest=null;
		
		
		ByteArrayInputStream bais= new ByteArrayInputStream(src);
		ByteArrayOutputStream baos= new ByteArrayOutputStream(); //버퍼에 넣는다
		
		int data=-1;
		
		while((data=bais.read()) != -1 ){
			
			
			baos.write(data);
			
		}
		
		dest=baos.toByteArray();
		System.out.println(Arrays.toString(src)); //배열을 스트링으로 바꾸기
		System.out.println(Arrays.toString(dest));
		
		
		
		
		
		
	}

}
