/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfNumbersInAString {
	public static int SumOfNumbersInAString(String str) {
		int sum = 0;
		String s = "0";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				s += str.charAt(i);
				if (i == str.length() - 1) {
					sum += Integer.parseInt(s);
				}
			} else {
				sum += Integer.parseInt(s);
				s = "0";
			}
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		System.out.println(SumOfNumbersInAString(str));

	}

}
