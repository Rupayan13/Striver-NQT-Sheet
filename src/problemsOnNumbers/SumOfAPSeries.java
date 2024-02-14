/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfAPSeries {
	public static int sumOfAPSeries(int a, int d, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=(a+(i*d));
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first term:-");
		int a=sc.nextInt();
		System.out.println("Enter the common difference:-");
		int d=sc.nextInt();
		System.out.println("Enter the last number of term:-");
		int n=sc.nextInt();
		System.out.println(sumOfAPSeries(a, d, n));

	}

}
