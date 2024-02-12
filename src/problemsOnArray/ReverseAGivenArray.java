/**
 * 
 */
package problemsOnArray;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseAGivenArray {
	public static void swap(int arr[], int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void reverseAGivenArray(int arr[]) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			swap(arr, low, high);
			low++;
			high--;
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array :-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements :-");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printArray(arr);
		reverseAGivenArray(arr);
		printArray(arr);

	}

}
