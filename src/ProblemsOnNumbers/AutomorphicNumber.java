/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AutomorphicNumber {
	public static int digitNumber(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	public static boolean isAutomorphicNumber(int n) {
		int p=digitNumber(n);
		int num=(int)Math.pow(n, 2);
		int rem=(num%(int)Math.pow(10, p));
		if(rem==n) {
			return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		System.out.println(isAutomorphicNumber(n));

	}

}
