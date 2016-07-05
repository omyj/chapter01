package chapter01;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.print("n1, n2 : ");
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int block;
		if (n1 > n2) {
			block = n1;
			n1 = n2;
			n2 = block;
		}

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);

		int[] mNumber = new int[] { 20, 10, 50 };

		int max = mNumber[0];

		for (int i = 1; i < mNumber.length; i++) {
			if (mNumber[i] >= max) {
				max = mNumber[i];
			}
		}
		System.out.println("MAX : " + max);
	}

}
