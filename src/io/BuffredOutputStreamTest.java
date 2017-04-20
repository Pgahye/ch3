package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조스트림과 주스트림의 사용법 
public class BuffredOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = null; // .......? 왜 이것만 닫음??

		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			bos = new BufferedOutputStream(fos, 5); // 버퍼사이즈, 객체를 가지고 와서 확장시키는것
													// ?? = 데코레이션

			for (int i = '1'; i <= '9'; i++) {

				bos.write(i); // 다차거나, close 되면 flash를 함(내보내기)
				bos.flush(); // 버퍼를 주므로써 입출력 횟수가 줄어든다. 버퍼가 차면 내보내니까 . 버퍼가 차지 않은
								// 상태에서 플러시를 한다.

			}
			// for(int i=49; i<=57; i++){

			// }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음" + e);
		} catch (IOException e) {

			System.out.println("I/O오류 :" + e);

		} finally {

			try {

				if (bos != null) {

					bos.close(); // 하나만 닫아주면 된다.

				}
			} catch (IOException e) {
				System.out.println("I/O오류 : " + e);

			}
		}

	}

}
