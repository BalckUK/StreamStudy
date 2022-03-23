package stringbuilder;

public class StringBuilderExample {
	
//	StringBuilder와 StringBuffer 클래스도 String 클래스와 같이 문자열을 다루는 클래스입니다. 
//	다만, String 클래스가 문자열을 생성자로 넣어 인스턴스를 한 번 생성하고 나면 인스턴스가 가진 문자열 값을 변경하지 
//	못하는 단점을 보완한 클래스입니다. 즉, 같은 인스턴스 안의 문자열(char 배열) 필드 값을 추가하거나 
//	변경할 수 있도록 되어 있습니다. 
//	또한 원본 문자열을 바꿀 수 있는만큼 문자열을 다루는 메소드도 더 많이 포함되어 있습니다.
	
//	두 가지 클래스는 모두 쓰임과 메소드가 같지만, StringBuffer는 
//	여러곳에서 동시에 같은 문자열 인스턴스에 접근할 때 중복 점유를 막을 수 있는 장치가 되어 있습니다(동기화 처리). 
//	때문에 StringBuilder에 비해 좀 더 무겁습니다. 
//	따라서 특별한 이유가 없다면 StringBuilder를 사용하는 것이 일반적입니다.
	
	
//	[ String 클래스와 동일 메소드 ]
//
//	charAt() - 특정 인덱스 위치의 문자 반환
//	indexOf() / lastIndexOf() - 문자열 검색해서 위치 반환
//	length() - 문자열 길이 반환
//	replace() - 검색된 문자열 교체
//	substring() - 특정 인덱스 범위 내 문자열을 복사해서 새로 생성된 인스턴스 반환
//	toString() - 문자열 출력
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(" World");
		System.out.println(builder);
		
	}
}
