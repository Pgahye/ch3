package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr=null;
		FileInputStream fis=null;
		
			try {
				fr=new FileReader("Hello.txt");
				fis=new FileInputStream("Hello.txt");
				
				int count=0;
				
				
				int data=-1;

				while((data=fr.read()) != -1 ){ 
					
					count++;
					System.out.print((char)data);
					
					
				}
				
				System.out.print("\n읽은 횟수 : " + count);
				count=0;
				
				while((data=fis.read()) != -1 ){ 
					
					count++;
					System.out.print((char)data);
				
				}
				
				System.out.print("\n읽은 횟수 : " + count);
				
			} catch (FileNotFoundException e) { //IOException가 부모라서 아래 catch문과 자리를 바꾸면 에러가남, 부모껄로 리턴되서 안쓰임
				// TODO Auto-generated catch block
			System.out.println("파일 없음" + e);
			}catch(IOException e){
				
				System.out.println("I/O오류 :"+e);
				
			}finally{
				
				try{
				if(fr!=null){
					fr.close();
				
				}
				if(fis != null){
					
					fis.close();	
					
				}
				}catch(IOException e){
					System.out.println("I/O오류 : "+e);
					
				}
			}
			
	}

}
