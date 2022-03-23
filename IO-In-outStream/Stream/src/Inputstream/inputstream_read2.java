package Inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputstream_read2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C://Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		/*
		 * while((readByteNo = is.read(readBytes)) != -1) {
		 * System.out.println(readByteNo); }
		 */

		String data = "";
		while (true) {
			readByteNo = is.read(readBytes);
			if (readByteNo == -1) {
				break;
			}
			//디코딩
			data += new String(readBytes, 0, readByteNo,"UTF-8");
		}
		System.out.println(data);
		is.close();
	}

}
