/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PowerOfANumber {
	public static int power(int n, int p) {
		int res=1;
		for(int i=1;i<=p;i++) {
			res*=n;
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		System.out.println("Enter the power :-");
		int p=sc.nextInt();
		System.out.println(power(n, p));

	}

}
