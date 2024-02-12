/**
 * 
 */
package problemsOnArray;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CountFreqOfEachElement {
	public static void countFreqOfEachElement(int arr[]) {
		int n = arr.length;
		boolean isVisited[] = new boolean[n];
		for (int i = 0; i < n - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					isVisited[j] = true;
				}
			}
			if (isVisited[i] == false)
				System.out.println(arr[i] + " " + count);
//			isVisited[i]=true;
		}
		if (isVisited[n - 1] == false)
			System.out.println(arr[n - 1] + " 1");
	}

	public static void countFreqOfEachElement1(int arr[]) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!freq.containsKey(arr[i])) {
				freq.put(arr[i], 1);
			} else {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			}
		}
		for(var e:freq.keySet()) {
			System.out.println(e+" "+freq.get(e));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in an array :-");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements :-");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		countFreqOfEachElement1(arr);

	}

}
