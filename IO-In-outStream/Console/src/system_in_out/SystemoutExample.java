package system_in_out;

import java.io.OutputStream;

public class SystemoutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(13);
		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		os.write(13);
		String hangul = "가다다라마바사아자차카타파하";
		byte[] hangulByte = hangul.getBytes();
		os.write(hangulByte);
		os.flush();
		os.close();
	}
}
