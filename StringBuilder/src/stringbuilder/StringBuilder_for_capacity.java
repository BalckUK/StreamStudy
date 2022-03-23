package stringbuilder;

public class StringBuilder_for_capacity {
	
//	[ capacity() ]
//
//	String Ŭ������ �ٸ��� char[] �迭 ����� ���� �ְ� ��Ƶ�
//	���� char[] �迭�� ���� ������ ������ ��ȯ
//	length()�� ���� �����Ͱ� ����ִ� ���ڿ� ��ü�� �����̰� capacity()�� ���� �迭 ������
//	append() �� ���ڿ� ������ �� �迭 ����� �ڵ����� �����
	
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
