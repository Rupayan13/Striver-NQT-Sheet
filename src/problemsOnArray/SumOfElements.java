/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfElements {
	public static int sumOfElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,1,5,1};
		System.out.println("Sum of all elements in the array is :- "+sumOfElements(arr));

	}

}
