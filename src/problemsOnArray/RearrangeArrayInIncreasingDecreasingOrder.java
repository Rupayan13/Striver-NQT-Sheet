/**
 * 
 */
package problemsOnArray;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RearrangeArrayInIncreasingDecreasingOrder {
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
	public static void increasingOrder(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>=arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	public static void decreasingOrder(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in an array :-");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements :-");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	}

}
