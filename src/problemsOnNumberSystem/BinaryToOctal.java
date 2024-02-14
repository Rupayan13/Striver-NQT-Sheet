/**
 * 
 */
package problemsOnNumberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinaryToOctal {
	public static int binaryToDecimal(String str) {
		int n = str.length();
		int p = 0;
		int sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				sum += (int) Math.pow(2, p);
			}
			p++;
		}
		return sum;
	}

	public static int binaryToOctal(String str) {
		int n = str.length();
		if (n % 3 == 1) {
			str = "00" + str;
		} else if (n % 3 == 2) {
			str = "0" + str;
		}
		String ans = "";
	    for (int i = 0; i < n; i += 3) {
	      int temp = (str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2) - '0') * 1;
	      ans = ans + Integer.toString(temp);
	    }
	    return Integer.parseInt(ans);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		String str = sc.nextLine();
		System.out.println(binaryToOctal(str));

	}

}
