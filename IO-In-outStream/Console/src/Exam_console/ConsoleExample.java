package Exam_console;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		
		//console이라는 메소는 이클립스에서 실행할때는 null을 리턴한다 그래서
		//반드시 명령프롬포트에서 실행해야 한다.
		Console console = System.console();
		
		System.out.println("아이디 : ");
		String id = console.readLine();
		
		System.out.println("패스워드 : ");
		char[] charPass = console.readPassword();
		
		String strPassword = new String(charPass);
		
		System.out.println("-------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
