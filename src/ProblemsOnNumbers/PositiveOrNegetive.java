/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PositiveOrNegetive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive.");
		}else if(n<0) {
			System.out.println("Negetive.");
		}else {
			System.out.println("Zero.");
		}

	}

}
