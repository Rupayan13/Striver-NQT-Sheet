/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveDuplicateElements {
	public static void removeDuplicateElements(int arr[]) {
		int n=arr.length;
		int mark[]=new int[n];
		for(int i=0;i<n;i++) {
			mark[i]=1;
		}
		for(int i=0;i<n-1;i++) {
			if(mark[i]==1) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						mark[j]=0;
					}
				}
			}
		}
		System.out.println("Unique array is :-");
		for(int i=0;i<n;i++) {
			if(mark[i]==1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,3,9,2,4,1,10,89,34};
		removeDuplicateElements(arr);

	}

}
