/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintFibonacciSeries {
	public static void printFibonacciSeries(int n) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms :-");
		int n=sc.nextInt();
		printFibonacciSeries(n);

	}

}
