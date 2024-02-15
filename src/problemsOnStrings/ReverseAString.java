/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseAString {
	public static String reverse(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		String ans = reverse(str);
		System.out.println(ans);

	}

}
