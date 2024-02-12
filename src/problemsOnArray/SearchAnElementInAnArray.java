/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SearchAnElementInAnArray {
	public static int searchAnElementInAnArray(int arr[], int k) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				index=i;
				break;
			}
		}
		return index;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		int k=3;
		System.out.println(searchAnElementInAnArray(arr, k));

	}

}
