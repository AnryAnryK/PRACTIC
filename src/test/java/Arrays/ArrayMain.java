package Arrays;


import java.util.Arrays;

class ArrayMain {
	public static void main(String[] args) {
		int[] array = {1, 5, 4, 3, 7};
		System.out.println(array); //[I@7ab2bfe1
		System.out.println(Arrays.toString(array)); //[1, 5, 4, 3, 7]
		Arrays.sort(array, 0, 4);
		System.out.println(Arrays.toString(array)); //[1, 3, 4, 5, 7]
		int key = Arrays.binarySearch(array, 5);
		System.out.println(key); // 3, т.е. система ищет в уже отсортированном в 12 строке коде цифру "5", которая стоит 4-й по счёту, следовательно у неё индекс "3" (т.к. все индексы начинают отчёт с "0")
		System.out.println(Arrays.binarySearch(array, 0)); //-1 , т.е. система ищет в уже отсортированном в 12 строке коде цифру "0" и т.к. её там нет среди чисел, то результат всегда будет "-1"

	}
}

