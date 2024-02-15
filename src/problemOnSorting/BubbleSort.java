/**
 * 
 */
package problemOnSorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BubbleSort {
	public static void swap(int arr[], int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 12, 5, 45, 1, 9 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

	}

}
