/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Palindrome {
	public static boolean isPalindrome(int n) {
		int num=n;
		int newNum=0;
		while(n>0) {
			int digit=n%10;
			newNum=(newNum*10)+digit;
			n/=10;
		}
		if(newNum==num) {
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
		System.out.println(isPalindrome(n));

	}

}
