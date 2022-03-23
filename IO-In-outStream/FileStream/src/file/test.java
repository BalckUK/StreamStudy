package file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class test {
	public static void main(String[] args) throws Exception {

		// 바이트 기반으로 읽음 그때문에 한글이 깨짐
		// 뒤에서 배우겠지만 보조스트림을 사용하여 문제를 해결 할 수 있음
		InputStream in = new FileInputStream("C:/Temp/test.txt");
		int bytes;
		byte[] by = new byte[3];
		while ((bytes = in.read(by)) != -1) {
			System.out.print((char) bytes);
		}
		System.out.println();
		System.out.println();

		// 또는 Reader를 사용해서 하면 됨 내 생각에는 두개의스트림에 기본 인코딩 방식이 다른 것 같음
		Reader re = new FileReader("C:/Temp/test.txt");
		int count = 0;
		while ((count = re.read()) != -1) {
			System.out.print((char) count);
		}
	}
}
