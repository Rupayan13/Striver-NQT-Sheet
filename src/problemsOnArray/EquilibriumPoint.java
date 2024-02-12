/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class EquilibriumPoint {
	public static int sumOfElements(int arr[], int l, int h) {
		int sum=0;
		for(int i=l;i<=h;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int equilibriumPoint(int arr[]) {
		int firstTest=sumOfElements(arr, 1, arr.length-1);
		if(firstTest==0) {
			return 0;
		}
		for(int i=1;i<=arr.length-2;i++) {
			int sum1=sumOfElements(arr, 0, i-1);
			int sum2=sumOfElements(arr, i+1, arr.length-1);
			if(sum1==sum2) {
				return i;
			}
		}
		int lastTest=sumOfElements(arr, 0, arr.length-2);
		if(lastTest==0) {
			return arr.length-1;
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-1,4};
		System.out.println(equilibriumPoint(arr));

	}

}
