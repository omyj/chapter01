package chapter01;

import javax.management.relation.Relation;

public class OperatorTest {
	static boolean result;

	
	public static void relation(int a, int b){
		// 관계연산자의 처리우선순의
		result = (a > b);
		System.out.println(result);

		result = (a == b);
		System.out.println(result);
	}
	
	public void logic(int a, int b){		
		
	}
	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		relation(7,3);
	}
}
