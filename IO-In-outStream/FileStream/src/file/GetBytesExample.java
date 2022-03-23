package file;

import java.io.UnsupportedEncodingException;

public class GetBytesExample {
	public static void main(String[] args) {
		String str = "안녕";
		//인코딩
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);

		//디코딩
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);

		
		try {
			//인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			
			//디코딩
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes1 -> String : " + str2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
