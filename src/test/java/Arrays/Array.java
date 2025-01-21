package Arrays;

import org.junit.jupiter.api.Test;

public class Array {
	int[] year = new int[12];
	String[] mounths = new String[]
			{"Январь", "Февраль", "Март"};

	@Test
	public void Array() {
		System.out.println("Количество месяцев = " + year.length);
		System.out.println("Месяц = " + mounths[0]);
		System.out.println("Месяц = " + mounths[1]);
		System.out.println("Месяц = " + mounths[2]);
		System.out.println("=====================================");
	}

	@Test
	public void Decada() {
		for (int m = 0; m <= 2; m++)
			System.out.println(mounths[m]);
	}


}
