package question3;

public class ArraySortDemo {

	void sortArray(float[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					float temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println("Elements in Descending Order at index: " + i + " is: " + array[i]);
		}
	}

	public static void main(String[] args) {

		float arr[] = { 0.1f, 0.2f, 0.3f };
		ArraySortDemo obj = new ArraySortDemo();
		obj.sortArray(arr);

	}
}
