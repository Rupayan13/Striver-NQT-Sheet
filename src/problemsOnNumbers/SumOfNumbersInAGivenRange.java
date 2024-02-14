/**
 * 
 */
package problemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfNumbersInAGivenRange {
	public static int sumOfNumbersInAGivenRange(int l, int h) {
		int sum=0;
		for(int i=l;i<=h;i++) {
			sum+=i;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower range :-");
		int l=sc.nextInt();
		System.out.println("Enter higher range :-");
		int h=sc.nextInt();
		System.out.println(sumOfNumbersInAGivenRange(l, h));

	}

}
