package file;

import java.io.FileReader;
import java.io.Reader;

public class TestBuilder {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		String data = "";
		char[] bytes = new char[2];
		/*
		 * 이러한 식으로 만들어 지게 되면 2개씩 읽을 때마다 객체를 생성하게 되고 불필요하게 객체가 메모리를 차지하게 된다
		 * 이러한 String에 문제를 해결하기 위해 StringBuilder를 사용하면 불필요하게 객체가 생성되는 것을 막을 수 있다
		 * */
		int count = 0;
		while ( (count = reader.read(bytes)) != -1) {
			data += new String(bytes, 0, count);
		}
		System.out.println(data);
		
		
		
		//성능개선
		Reader reader1 = new FileReader("C:/Temp/test.txt");
		StringBuilder su = new StringBuilder();
		/*
		 * 이러한 식으로 StringBuilder를 사용하면 불필요한 객체를 생성하는 것을 방지할 수 있다 
		 * 즉 메모리를 더 효율적으로 활용할 수 있다 또한 new String할 경우에는 차후에
		 * 삽입, 삭제등을 할 때 또 객체를 생성해야 하지만 StringBuilder는 그러한 문제를 해결할 수 있다
		 * */
		while(reader1.read(bytes) != -1) {
			su.append(bytes);
		}
		System.out.println(su.toString());
	}
}
