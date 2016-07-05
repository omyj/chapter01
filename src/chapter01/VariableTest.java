package chapter01;

class VariableTest {
	public void variableTest() {
		int num1 = 10;
		int num2;

		num2 = 20;

		System.out.println(num1 + "*" + num2 + " = " + num1 * num2);
		// 변수
		float f = 3.14f; //
		double d = 3.14;
		// String은 참조형 
		String s = "Hello World"; // 편의를 위한 생략
		System.out.println("f : " + f + "\nd : " + d + "\ns : "+s);

		String myStr = new String("Hello World"); // String의 정식 문법, myStr은 참조타입
		System.out.println(myStr);
		// 상수 항상 동일한 값을 저장(정의)한다.
		// 새로운 값으로 대입할 수 없다. ex)PI = 123;
		final double PI = 3.14;
	}

}