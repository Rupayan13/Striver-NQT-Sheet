/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even Number.");
		}else {
			System.out.println("Odd Number.");
		}

	}

}
