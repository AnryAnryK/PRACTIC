package ErrorsAndExceptions;

public class ErrorsAndExceptions {



	public static void main(String[] args) {
		ErrorsAndExceptions errorsAndExceptions = new ErrorsAndExceptions();
		errorsAndExceptions.testPush();
	}

	public Check check;  // а с синтаксисом = new Check()  - объект check будет создан и поэтому NullPointerException  не вылезет !

	public void testPush() {
		try {           // с этим блоком _ try { } catch (Exception e) {}  _  ошибка NullPointerException  выпадать не будет, т.к. мы вручную говорим среде, чтобы этот случай попадал в Исключения (и, соответственно, обрабатывался БЕЗ ошибки !)
			check.push2();
		} catch (Exception e) {
		} finally {
			System.out.println(check);
//		while (true);  // с этим блоком Программа будет Работать вечно )))

		}
	}
}
