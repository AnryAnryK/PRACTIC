package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
	List<String> stream1 = new ArrayList<>();
	stream1.add ("123");
	stream1.add ("aaa");
	stream1.add ("123aaa123");

	stream1.stream()
			.filter(val -> !val.equals("123"))
			.forEach(val -> System.out.println(stream1));
		;
}
}