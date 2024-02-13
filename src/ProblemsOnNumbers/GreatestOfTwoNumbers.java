/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class GreatestOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :-");
		double first=sc.nextDouble();
		System.out.println("Enter second number :-");
		double second=sc.nextDouble();
		System.out.println("The greatest among "+first+" and "+second+" is "+Math.max(first, second));

	}

}
