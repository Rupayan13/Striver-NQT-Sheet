/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseDigitsOfANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			sum=(sum*10)+(n%10);
			n/=10;
		}
		System.out.println("Reverse of "+num+ " is "+sum);

	}

}
