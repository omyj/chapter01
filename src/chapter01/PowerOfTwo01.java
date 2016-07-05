package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] power) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);

		System.out.print("승수 : ");
		int pow = scanner.nextInt();
		int result = 1;

		for (int i = 0; i < pow; i++) {
			result *= 2;
		}
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");

//		int j = 0; 
//		while(j<pow){
//			result *= 2;
//			j++;
//		}
//		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
		
		scanner.close(); //외부의 자원을 사용할 땐 항시 다쓰고 닫아줘야한다.
	}
}
