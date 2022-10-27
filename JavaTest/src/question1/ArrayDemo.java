package question1;

public class ArrayDemo {
	public void setIntegerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("The Value Of Old Array is" + array[i]);
		}
	}

	public void manupulateIntegerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + 5;
			System.out.println("The Value Of New Array is" + array[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayDemo obj = new ArrayDemo();
		obj.setIntegerArray(arr);
		obj.manupulateIntegerArray(arr);

	}

}