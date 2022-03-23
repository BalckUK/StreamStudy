package file;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test.txt");
		int data;
		while((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
	}
}
