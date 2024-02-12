/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CheckingArrayIsSubsetOfAnotherWay {
	public static boolean checkingArrayIsSubsetOfAnotherWay(int arr1[], int arr2[]) {
		int m=arr1.length;
		int n=arr2.length;
		if(m>n) return false;
		for(int i=0;i<m;i++) {
			boolean isPresent=false;
			for(int j=0;j<n;j++) {
				if(arr1[i]==arr2[j]) {
					isPresent=true;
				}
			}
			if(isPresent==false) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,4,5,2};
		int arr2[]= {11,12,13,15,16};
		System.out.println(checkingArrayIsSubsetOfAnotherWay(arr1, arr2));

	}

}
