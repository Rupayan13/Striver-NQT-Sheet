/**
 * 
 */
package problemsOnArray;

import java.util.Arrays;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MedianOfAllElements {
	public static double medianOfAllElements(int arr[]) {
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2==0) {
			int i1=(n/2)-1;
			int i2=(n/2);
			return (double)(arr[i1]+arr[i2])/2;
		}else {
			return (double)arr[n/2];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 5, 1, 7};
		System.out.println(medianOfAllElements(arr));

	}

}
