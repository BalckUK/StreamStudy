package stringbuilder;

public class StringBuilder_for_capacity {
	
//	[ capacity() ]
//
//	String 클래스와 다르게 char[] 배열 사이즈를 여유 있게 잡아둠
//	현재 char[] 배열이 가진 사이즈 정보를 반환
//	length()는 실제 데이터가 들어있는 문자열 자체의 길이이고 capacity()는 현재 배열 사이즈
//	append() 등 문자열 조정할 때 배열 사이즈가 자동으로 변경됨
	
	public static void main(String[] args) {
		StringBuilder bulider = new StringBuilder("Hello");
		
		System.out.println(bulider.length());
		System.out.println(bulider.capacity());
		
		bulider.append(" World");
		System.out.println(bulider);             	// "Hello World"
//		
		System.out.println(bulider.length()); 	// 11
		System.out.println(bulider); 	// 21
		
		bulider.append(" Hi everybody!!!!");
		System.out.println(bulider);             	// Hello World Hi everybody!!!!
//
		System.out.println(bulider.length()); 	// 28
		System.out.println(bulider.capacity()); 	// 44		
	}

}
