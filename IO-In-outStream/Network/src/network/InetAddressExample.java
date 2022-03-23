package network;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 IP 주소 : "+ local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com 주소 : "+ remote.getHostAddress());
		}
	}
}
