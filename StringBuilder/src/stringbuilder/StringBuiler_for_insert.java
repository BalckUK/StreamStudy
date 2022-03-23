package stringbuilder;

public class StringBuiler_for_insert {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("He World");

		a.insert(2, "llo");
		System.out.println(a); // "Hello World"

		a.insert(5, 55);
		System.out.println(a); // "Hello55 World"
	}

}
