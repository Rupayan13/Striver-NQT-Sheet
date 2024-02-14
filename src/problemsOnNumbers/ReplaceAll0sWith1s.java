/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReplaceAll0sWith1s {
	public static int replaceAll0sWith1s(int n) {
		int sum=0;
		int temp=1;
		while(n>0) {
			int digit=n%10;
			if(digit==0) {
				digit=1;
			}
			sum=(digit*temp)+sum;
			temp*=10;
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
		System.out.println(replaceAll0sWith1s(n));

	}

}
