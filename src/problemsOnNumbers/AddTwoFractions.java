/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AddTwoFractions {
	public static int gcd(int x, int y) {
		while (x % y != 0) {
			int rem = x % y;
			x = y;
			y = rem;
		}
		return y;
	}

	public static int lcm(int m, int n) {
		if (n >= m) {
			return ((n * m) / gcd(n, m));
		} else {
			return ((n * m) / gcd(m, n));
		}
	}

	public static void AddTwoFractions(int num1, int den1, int num2, int den2) {
		int denLcm = lcm(den1, den2);
		int newNum = num1 * (denLcm / den1) + num2 * (denLcm / den2);
		if (newNum % denLcm == 0) {
			System.out.println("Resultant fraction is :-" + (newNum / denLcm) + "/1");
		} else {
			System.out.println("Resultant fraction is :-" + newNum + "/" + denLcm);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first fraction :-");
		System.out.println("Numerator :-");
		int num1 = sc.nextInt();
		System.out.println("Denominator :-");
		int den1 = sc.nextInt();
		System.out.println("Enter Second fraction :-");
		System.out.println("Numerator :-");
		int num2 = sc.nextInt();
		System.out.println("Denominator :-");
		int den2 = sc.nextInt();
		AddTwoFractions(num1, den1, num2, den2);

	}

}
