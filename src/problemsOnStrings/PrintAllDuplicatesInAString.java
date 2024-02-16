/**
 * 
 */
package problemsOnStrings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintAllDuplicatesInAString {
	public static void printAllDuplicatesInAString(String str) {
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!freq.containsKey(ch)) {
				freq.put(ch, 1);
			} else {
				freq.put(ch, freq.get(ch) + 1);
			}
		}
		for (var e : freq.keySet()) {
			if (freq.get(e) > 1) {
				System.out.println(e + "-" + freq.get(e));
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		printAllDuplicatesInAString(str);

	}

}
