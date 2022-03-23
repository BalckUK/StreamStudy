package stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamSorting {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		intStream
		.sorted()
		.forEach(n -> System.out.print(n+", "));
		System.out.println();
		
		List<Student> studentlist = Arrays.asList(
				(new Student("홍길동",30)),
				(new Student("신용권",10)),
				(new Student("유미선",20))
		);
		
		studentlist.stream()
		.sorted()
		.forEach(s -> System.out.println(s.getScore()+ ", "));
		
		System.out.println("====================");
		
		
		studentlist.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getScore()+ ", "));
	}
}
