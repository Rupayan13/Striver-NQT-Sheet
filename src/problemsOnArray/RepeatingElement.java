/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RepeatingElement {
	public static void repeatingElement(int arr[]) {
		boolean isRepeated[]=new boolean[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && isRepeated[i]==false) {
					isRepeated[j]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(isRepeated[i]==true) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4,4,5,2};
		repeatingElement(arr);

	}

}
