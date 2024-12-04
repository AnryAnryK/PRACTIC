package Overload;

public class Overload {
	int Summ (int a, int b){
		return a + b;
	}
	double Summ (double a, double b){
		return a + b;
	}
	public static void main(String[] args) {
		Overload luggage = new Overload();
		System.out.println(luggage.Summ(2,3));
		System.out.println(luggage.Summ(2.1, 3.2));
	}
}
