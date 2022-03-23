package stringbuilder;

public class StringBuilder_for_delete {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Hello");
		
		a.append(" World");
		System.out.println(a);
		
		a.delete(6, 9);
		System.out.println(a);
	}

}
