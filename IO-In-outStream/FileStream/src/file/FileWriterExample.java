package file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception{
		
		// 책에 예제
		File file = new File("C:/Temp1/file.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("FileWriter는 한글로된 "+ "\r\n");
		fw.write("문자열을 바로 출력할 수 있다"+ "\r\n");
		fw.flush();
		fw.close();
		
		// 내가 생각한 코드
		FileWriter fw1 = new FileWriter("c:/Temp1/filey.txt");
		fw1.write("이렇게 하는게 더 나은거 같은데 코드도 더 간결해지고...");
		fw1.flush();
		fw1.close();
		
		System.out.println("파일에 저장되었습니다");
	}
}
