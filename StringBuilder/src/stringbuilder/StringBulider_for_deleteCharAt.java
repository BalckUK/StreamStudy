package stringbuilder;

public class StringBulider_for_deleteCharAt {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Hello");

		a.append(" World");
		System.out.println(a); // "Hello World"

		// a.delete(6,7) °ú °°À½
		a.deleteCharAt(6);
		System.out.println(a); // "Hello orld"
	}

}
