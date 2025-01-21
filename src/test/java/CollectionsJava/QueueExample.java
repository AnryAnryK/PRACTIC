package CollectionsJava;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("apple");
		queue.add("banana");
		queue.add("orange");

		System.out.println("Queue: " + queue);

		queue.remove("banana");
//		String element = queue.remove(); // эта  и 20 строка нужна, если хотим узнать КАКОЙ именно элемент был выведен из Очереди
//		System.out.println("Removed element: " );

		System.out.println("Queue: " + queue);
	}
}
