package file;

public class NewString {
	public static void main(String[] args) throws Exception {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		System.out.println(bytes.length);
		//디코딩
		String str1 = new String(bytes);
		System.out.println(str1);


		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		//인코딩
		String str = new String(bytes, 0, readByteNo);
		System.out.println(str);
		
	
	}
}
