/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaximumProductSubArray {
	public static int maximumProductSubArray(int arr[]) {
		int result=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			int product=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				product*=arr[j];
				if(result<=product) {
					result=product;
				}
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-3,0,-4,-5};
		int arr1[]= {1,2,3,4,5,0};
		System.out.print("The maximum product subarray is: "+maximumProductSubArray(arr1));

	}

}
