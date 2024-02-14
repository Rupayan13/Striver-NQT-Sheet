/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaximumAndMinimumDigitInANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		while(n>0) {
			int digit=n%10;
			largest=Math.max(largest, digit);
			smallest=Math.min(smallest, digit);
			n/=10;
		}
		System.out.println("Largest Digit :-"+largest);
		System.out.println("Smallest Digit :-"+smallest);

	}

}
