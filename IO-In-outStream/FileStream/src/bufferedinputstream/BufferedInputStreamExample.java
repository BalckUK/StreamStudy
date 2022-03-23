package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\src\\bufferedinputstream\\house1.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		fis1.close();
		System.out.println("사용하지 않았을 때 : "+ (end-start)+ "ms");
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\src\\bufferedinputstream\\house1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		fis2.close();
		bis.close();
		System.out.println("사용했을 때 : "+ (end-start)+ "ms");
		
	}

}
