/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AreaOfACircle {
	public static double areaOfACircle(int r) {
		double res=0.0;
		res=3.14*Math.pow(r, 2);
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious of the circle :-");
		int r=sc.nextInt();
		System.out.println(areaOfACircle(r));

	}

}
