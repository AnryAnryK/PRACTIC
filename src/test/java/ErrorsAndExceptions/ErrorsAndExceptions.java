package ErrorsAndExceptions;

public class ErrorsAndExceptions {

	public static void main(String[] args) {
ErrorsAndExceptions errorsAndExceptions = new ErrorsAndExceptions();
errorsAndExceptions.testPush();

//			System.out.println(1/0);
	}

	public Check check ;  // а с синтаксисом = new Check()  - объект check будет создан и поэтому NullPointerException  не вылезет !

	public void testPush(){
check.push2();
//		System.out.println(check);
	}


}
