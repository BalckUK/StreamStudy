package socket_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		try {
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
			
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();
			message = "Hello server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount);
			System.out.println("데이터 받기 성공 : "+ message);
			
			os.close();
			is.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
