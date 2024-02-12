/**
 * 
 */
package problemsOnArray;

import java.util.HashMap;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SortElementsByItsFreq {
	public static void sortElementsByItsFreq(int arr[]) {
		HashMap<Integer, Integer> freq=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!freq.containsKey(arr[i])) {
				freq.put(arr[i], 1);
			}else {
				freq.put(arr[i], freq.get(arr[i])+1);
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(freq.get(arr[i])<=freq.get(arr[j])) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-199,6,7,-199,3,5};
		printArray(arr);
		sortElementsByItsFreq(arr);
		printArray(arr);

	}

}
