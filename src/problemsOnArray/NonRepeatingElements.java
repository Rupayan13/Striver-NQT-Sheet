/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class NonRepeatingElements {
	public static void nonRepeatingElements(int arr[]) {
		boolean isRepeated[]=new boolean[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					isRepeated[i]=true;
					isRepeated[j]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(isRepeated[i]==false) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-1,1,3,1};
		int arr1[]= {1,2,3};
		nonRepeatingElements(arr1);

	}

}
