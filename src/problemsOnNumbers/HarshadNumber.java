/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class HarshadNumber {
	public static boolean isHarshadNumber(int n) {
		int sum=0;
		int num=n;
		while(n>0) {
			sum+=(n%10);
			n/=10;
		}
		if(num%sum==0) {
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
		System.out.println(isHarshadNumber(n));

	}

}
