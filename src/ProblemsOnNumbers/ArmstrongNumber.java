/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ArmstrongNumber {
	public static int digitNumber(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static boolean isArmstrong(int n) {
		int p = digitNumber(n);
		int num = n;
		int newNum = 0;
		while (n > 0) {
			int digit = n % 10;
			newNum += (int) Math.pow(digit, p);
			n /= 10;
		}
		if (num == newNum) {
			return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));

	}

}
