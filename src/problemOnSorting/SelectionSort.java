/**
 * 
 */
package problemOnSorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SelectionSort {
	public static void swap(int arr[], int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int small=arr[i];
			int smallIndex=i;
			for(int j=i+1;j<n;j++) {
				if(small>arr[j]) {
					small=arr[j];
					smallIndex=j;
				}
			}
			swap(arr, i, smallIndex);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 12, 5, 45, 1, 9 };
		printArray(arr);
		selectionSort(arr);
		printArray(arr);

	}

}
