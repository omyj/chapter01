package chapter01;

public class ArrayTest {
	public static void main(String[] args) {
		char[] c = new char[3];
		for (int i = 0; i < c.length; i++) {
			c[i] = (char)i;
			System.out.println((int)c[i]);
		}
		
		int[] scores = {100,200,300};
//		int[] scores2; 
//		scores2 = {100,200,300};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) { // 배열은 <=로 쓰지않도록 한다. out of bound
			sum = sum + scores[i];
			System.out.println(scores[i]);
		}
		int sum2 = 0;
		for(int score : scores){ // 확장 for문 ;알아서 배열에있는 값을 추출
			sum2 += score;
		}
		System.out.println(sum + "," + sum2);
	}
}
