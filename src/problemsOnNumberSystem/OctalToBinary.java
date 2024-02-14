/**
 * 
 */
package problemsOnNumberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class OctalToBinary {
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
	public static int octalToBinary(int n) {
		int num=octalToDecimal(n);
		return decimalToBinary(num);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n = sc.nextInt();
		System.out.println(octalToBinary(n));

	}

}
