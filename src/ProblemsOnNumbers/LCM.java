/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LCM {
	public static int gcd(int x, int y) {
		while(x%y!=0) {
			int rem=x%y;
			x=y;
			y=rem;
		}
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :-");
		int n=sc.nextInt();
		System.out.println("Enter the second number :-");
		int m=sc.nextInt();

	}

}
