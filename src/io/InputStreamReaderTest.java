package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//바이트의 주스트림으로 가지고 와서 char형태의 보조스트림을 끼워서 쓰는 형태 
		
		InputStreamReader isr=null;
		
		try {
			isr=new InputStreamReader(new FileInputStream("MS949.txt"),"MS949");
			int data=-1;
			
			while((data=isr.read())!=-1){
				
				
				System.out.print((char)data);
				
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("I/O오류 :" + e);

		}
		

	}

}
