/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfDigitsOfANumber {
	public static int sumOfDigitsOfANumber(int n) {
		int sum=0;
		while(n>0) {
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		System.out.println(sumOfDigitsOfANumber(n));

	}

}
