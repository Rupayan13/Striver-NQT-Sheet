/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LeapYearOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the years :-");
		int year=sc.nextInt();
		if(year%100==0) {
			if(year%400==0) {
				System.out.println("The year "+year+" is Leap Year.");
			}
		}else if(year%4==0) {
			System.out.println("The year "+year+" is Leap Year.");
		}else {
			System.out.println("The year "+year+" is not Leap Year.");
		}

	}

}
