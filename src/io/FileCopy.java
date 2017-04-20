package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("./cat.jpg"); //파일이 없을 경우를 위해서 예외처리문이 필요함 
			fos=new FileOutputStream("./cat2.jpg");
			
			int data=-1;

			while((data=fis.read()) != -1 ){  //I/O 오류를 위해서 예외처리문 필요 
				
				
				fos.write(data);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없음:"+e);
		}
		catch(IOException e){
			
			System.out.println("I/O오류 :"+e);
			
		}finally{
			
			try{
			if(fis!=null){
				fis.close();
			
			}
			if(fos != null){
				
				fos.close();	
				
			}
			}catch(IOException e){
				System.out.println("I/O오류 : "+e);
				
			}
		}
		
		
		
	}

}
