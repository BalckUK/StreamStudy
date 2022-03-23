package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\bin\\image/house1.jpg";
		String targetFileName = "C:/Temp1/house.jpg";

		InputStream fis = new FileInputStream(originalFileName);
		OutputStream fos = new FileOutputStream(targetFileName);

		/*
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes);
		}
		 */
		//이게 더 심플한거 같은데.. 구지 int readByteNo만들 필요가 없는거 같다
		byte[] readBytes = new byte[100];
		while(fis.read(readBytes) != -1) {
			fos.write(readBytes);
		}
		fos.write(readBytes);
		
		fos.flush();
		fis.close();
		fos.close();
		System.out.println("복사 완료");
	}
}
