/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfGPSeries {
	public static double sumOfGPSeries(int a, double r, int n) {
		double result=(a*(Math.pow(r, n)-1))/(r-1);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first term :-");
		int a=sc.nextInt();
		System.out.println("Enter the common ratio :-");
		double r=sc.nextDouble();
		System.out.println("Enter the number of terms :-");
		int n=sc.nextInt();
		System.out.println(sumOfGPSeries(a, r, n));

	}

}
