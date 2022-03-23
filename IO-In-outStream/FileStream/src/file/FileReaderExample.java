package file;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		Reader fr =new FileReader("C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\src\\file\\FileOutputStreamExample.java");
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}
}
