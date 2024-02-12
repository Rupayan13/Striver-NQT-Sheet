/**
 * 
 */
package problemsOnArray;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SmallestNumberInAnArray {
	public static int smallestNumberInAnArray(int arr[]) {
		int small=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			small=Math.min(small, arr[i]);
		}
		return small;
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
		System.out.println("Smallest element in the array is :- "+smallestNumberInAnArray(arr));

	}

}
