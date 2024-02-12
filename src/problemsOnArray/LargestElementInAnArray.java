/**
 * 
 */
package problemsOnArray;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestElementInAnArray {
	public static int largestNumberInAnArray(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array :-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :-");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Largest element in the array is :- "+largestNumberInAnArray(arr));

	}

}
