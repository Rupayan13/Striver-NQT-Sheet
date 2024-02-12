/**
 * 
 */
package problemsOnArray;

import java.util.Arrays;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReplaceElementByItsRank {
	public static void replaceElementByItsRank(int arr[]) {
		int n=arr.length;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=arr[i];
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==a[j]) {
					arr[i]=j+1;
//					a[j]=Integer.MIN_VALUE;
//					break;
				}
			}
		}
		
	}
	public static void printArray(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20, 15, 26, 2, 98, 6};
		int arr1[]= {1, 5, 8, 15, 8, 25, 9};
//		printArray(arr, arr.length);
//		replaceElementByItsRank(arr);
//		printArray(arr, arr.length);
		
		printArray(arr1, arr1.length);
		replaceElementByItsRank(arr1);
		printArray(arr1, arr1.length);

	}

}
