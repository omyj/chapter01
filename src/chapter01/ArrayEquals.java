package chapter01;

public class ArrayEquals {
	public static void main(String[] args) {
		int[] a1 = { 100, 200, 300 };
		int[] a2 = { 100, 200, 300 };

		boolean result = equls(a1, a2);

		System.out.println(result);
	}

	private static boolean equls(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		if (array1 == null && array2 == null)
			return false;
		if (array1.length != array2.length)
			return false;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}
		return true;
	}
}
