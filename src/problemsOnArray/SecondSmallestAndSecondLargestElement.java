/**
 * 
 */
package problemsOnArray;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SecondSmallestAndSecondLargestElement {
	public static int largestNumberInAnArrayIndex(int arr[]) {
		int max=Integer.MIN_VALUE;
		int largeIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				largeIndex=i;
			}
		}
		return largeIndex;
	}
	public static int smallestNumberInAnArrayIndex(int arr[]) {
		int small=Integer.MAX_VALUE;
		int smallIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(small>=arr[i]) {
				small=arr[i];
				smallIndex=i;
			}
		}
		return smallIndex;
	}
	public static int secondSmallestNumberInAnArray(int arr[]) {
		int smallest=smallestNumberInAnArrayIndex(arr);
		arr[smallest]=Integer.MAX_VALUE;
		return arr[smallestNumberInAnArrayIndex(arr)];
	}
	public static int secondLargestNumberInAnArray(int arr[]) {
		int largest=largestNumberInAnArrayIndex(arr);
		arr[largest]=Integer.MIN_VALUE;
		int i=largestNumberInAnArrayIndex(arr);
		return arr[i];
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
		System.out.println("Second smallest element in the array is :- "+secondSmallestNumberInAnArray(arr));
//		System.out.println("Second largest element in the array is :- "+secondLargestNumberInAnArray(arr));

	}

}
