/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AverageOfAllElementsInAnArray {
	public static double average(int arr[]) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return (double)sum/n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,1,1,5,1};
		System.out.println(average(arr));

	}

}
