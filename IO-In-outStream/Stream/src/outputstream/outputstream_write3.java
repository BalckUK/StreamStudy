package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputstream_write3 {
	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);
		os.flush();
		os.close();
	}
}
