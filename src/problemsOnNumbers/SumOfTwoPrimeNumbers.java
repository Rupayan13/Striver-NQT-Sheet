/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfTwoPrimeNumbers {
	public static boolean prime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {

		for(int i=0;i<=(n/2);i++) {
			if(prime(i) && prime(n-i)) {
				return true;
			}
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
		if (isPrime(n)) {
			System.out.println("Yes");
		} else if (!isPrime(n)) {
			System.out.println("No");
		}

	}

}
