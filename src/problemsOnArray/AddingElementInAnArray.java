/**
 * 
 */
package problemsOnArray;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AddingElementInAnArray {
	public static void insertAtBegining(int arr[], int n, int value) {
		for(int i=n-1;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=value;
	}
	public static void insertAtEnd(int arr[], int n, int value) {
		arr[n]=value;
	}
	public static void insertAt(int arr[], int p, int value, int n) {
		p--;
		for(int i=n-1;i>=p;i--) {
			arr[i+1]=arr[i];
		}
		arr[p]=value;
	}
	public static void printArray(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[100];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int n=5;
		printArray(arr, n);
		insertAtBegining(arr, n, 6);
		n++;
		insertAtEnd(arr, n, 7);
		n++;
		insertAt(arr, 4, 8, n);
		n++;
		printArray(arr, n);

	}

}
