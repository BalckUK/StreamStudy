package Inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputstream_read {
	public static void main(String[] args)throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
		/*while((readByte=is.read()) != -1) {
			System.out.println(readByte);
		}*/
		
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);
		}
		is.close();
	}
}
