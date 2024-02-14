/**
 * 
 */
package problemsOnNumberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DecimalToBinary {
	public static int decimalToBinary(int n) {
		int d = 1;
		int sum = 0;
		while (n > 0) {
			int digit = n % 2;
			sum = (digit * d) + sum;
			d*=10;
			n/=2;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n = sc.nextInt();
		System.out.println(decimalToBinary(n));

	}

}
