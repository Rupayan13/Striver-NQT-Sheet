/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FactorialOfANumber {
	public static int factorialIterative(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static int factorialRecursive(int n) {
		if(n==0 || n==1) return 1;
		return n*factorialRecursive(n-1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		System.out.println(factorialIterative(n));
		System.out.println(factorialRecursive(n));

	}

}
