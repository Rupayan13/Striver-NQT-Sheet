/**
 * 
 */
package problemOnSorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InsertionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 12, 5, 45, 1, 9 };
		printArray(arr);
		insertionSort(arr);
		printArray(arr);

	}

}
