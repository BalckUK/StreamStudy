package stirngbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		//String은 내부의 문자열을 수정할 수 없다
		/*
		 * 예를 들어 String data = "ABC"; 라는 코드가 있을 때
		 * data += "DEF"를 한다면 ABCDEF라는 객체가 새로 만들어 진다
		 * 원래의 객체에 DEF를 더하는 것이 아니라 따로 ABCDEF라는 객체가 새로 만들어지고 그 주소값을 가르키고 있는것이다
		 * 즉 필요하지 않은 객체가 생긴다는 단점이 있다 이러한 단점을 해결하기 위해서 StringBuilder와 StringBuffer가 만들어 졌다
		 * */
		
		/*
		 * StringBuffer
		 * 버퍼(buffer: 데이터를 임시로 저장하는 메모리)에 문자열을 저장한다.
		 * 버퍼 내부에서 추가,수정,삭제 작얼을 할 수 있다
		 * 멀티 스레드환경 : StringBuffer를 사용
		 * 단일 스레드환경 : StringBuilder를 사용
		 * */
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, 2);
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수 : "+ length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}
