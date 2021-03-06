package stream_looping;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
		.filter(s-> s%2==0)
		.peek(n-> System.out.println(n));
		
		System.out.println("[최종 처리 메소드를 마지가에 호출한 경우]");
		int total = Arrays.stream(intArr)
		.filter(s-> s%2==0)
		.peek(n-> System.out.println(n))
		.sum();
		
		System.out.println("총합 : "+ total);
	}
}
