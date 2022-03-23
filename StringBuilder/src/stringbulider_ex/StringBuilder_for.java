package stringbulider_ex;

import java.util.ArrayList;

public class StringBuilder_for {

//	자바에서 String 객체는 변경 불가능하다. 한 번 생성되면 내용을 바꿀 수 없단 뜻이다. 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
//	100만 개의 문자열을 연결해야 하는 상황이 왔다고 가정하자. 그리고 100만 개의 문자열을 추가로 생성했다고 하자.
//	문자열끼리 연결하는 작업 시에는 내부적으로 여러 작업이 발생하고, 기존 문자열 값의 길이에 추가된 문자열의 크기를 더한 크기의 
//	새로운 문자열이 생성된다. 이걸 100만 번 수행해야 하니 메모리를 많이 잡아먹게 되는 건 어찌보면 그렇게 되겠구나 싶다.
//	이 경우 고려해볼 수 있는 것 중 하나가 이 포스팅의 주제인 StringBuilder다. Stirng은 변경 불가능한 문자열을 생성하지만 
//	StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
//        String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
        String str = stringBuilder.toString();
        // 두 println()은 같은 값을 출력한다
        System.out.println(stringBuilder);
        System.out.println(str);
        
        System.out.println();
        
//        반복문에서 StringBuilder를 사용한다면 아래와 같이 사용할 수 있다.
        
        StringBuilder stringBuilder1 = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("첫 번째, ");
        list.add("두 번째, ");
        list.add("세 번째, ");
        list.add("네 번째, ");
        list.add("다섯 번째");
        for (int i = 0; i < list.size(); i++)
        {
            stringBuilder1.append(list.get(i));
        }
        System.out.println(stringBuilder1);
	}

}
