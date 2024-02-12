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
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void increasingOrder(int arr[]) {
		
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
