/**
 * 
 */
package problemsOnNumberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class OctalToDecimal {
	public static int octalToDecimal(int n) {
		int sum=0;
		int p=0;
		while(n>0) {
			int digit=n%10;
			sum+=(digit*(int)Math.pow(8, p));
			p++;
			n/=10;
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
		System.out.println(octalToDecimal(n));

	}

}
