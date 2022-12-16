package lab3_Assignments;

public class SortArrayInteger {
	void getSorted(int[] a, int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		System.out.println("Reversed array is: \n");
		for (int k = 0; k < n; k++) {
			System.out.println(a[k]);
		}
	}

	public static void main(String[] args) {

		SortArrayInteger e = new SortArrayInteger();
		int[] arr = { 10, 20, 30, 40, 50 };
		e.getSorted(arr, arr.length);
	}

}
