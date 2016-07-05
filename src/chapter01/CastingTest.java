package chapter01;

public class CastingTest {
	public static void main(String[] args) {
		int i = 100;
		long l = i;
		System.out.println(l);
		
		long l2 = 200;
		//int j = l2;
		int j = (int)l2;// 형변환
	}
}
