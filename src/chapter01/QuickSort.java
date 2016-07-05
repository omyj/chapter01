package chapter01;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

	public static void main(String[] args) {
		Random radom = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정렬 갯수 : ");
		int num = scanner.nextInt();
		
		System.out.println("랜덤 범위 : ");
		int range = scanner.nextInt();
		
		int[] data = new int[num];
		
		for (int i = 0; i < num; i++) {
			data[i] = radom.nextInt(range);
		}
//		int data[] = { 66, 10, 1, 34, 5, -10 };

		QuickSort quick = new QuickSort();
		quick.sort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.print("data[" + i + "] : " + data[i]+ "\t");
			if(i%10 == 0) System.out.println("");
		}
	}
}
