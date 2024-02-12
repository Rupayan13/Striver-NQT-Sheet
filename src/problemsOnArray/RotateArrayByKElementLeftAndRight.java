/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RotateArrayByKElementLeftAndRight {
	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void reverse(int arr[], int low, int high) {
		while (low <= high) {
			swap(arr, low, high);
			low++;
			high--;
		}
	}

	public static void rotateArrayByKElements(int arr[], int k, String s) {
		if (s == "Left") {
			reverse(arr, 0, k - 1);
			reverse(arr, k, arr.length - 1);
			reverse(arr, 0, arr.length - 1);
		} else {
			reverse(arr, 0, arr.length - 1);
			reverse(arr, 0, k - 1);
			reverse(arr, k, arr.length - 1);
		}

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k=2;
		printArray(arr);
		rotateArrayByKElements(arr, k, "Right");
		printArray(arr);

	}

}
