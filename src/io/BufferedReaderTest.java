package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;

		try {
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java"); // 주
																				// 스트림

			br = new BufferedReader(fr);

			int index = 0;
			String line = null;

			while ((line = br.readLine()) != null) { // 객체라서

				System.out.println(index++ + line);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("I/O오류 :" + e);

		} finally {

			try {

				if (br != null) {

					br.close(); // 하나만 닫아주면 된다.

				}
			} catch (IOException e) {
				System.out.println("I/O오류 : " + e);

			}
		}

	}

}
