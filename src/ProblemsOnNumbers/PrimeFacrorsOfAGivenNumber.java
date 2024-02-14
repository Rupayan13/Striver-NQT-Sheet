/**
 * 
 */
package ProblemsOnNumbers;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrimeFacrorsOfAGivenNumber {
	public static boolean isPrime(int n) {
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeFacrorsOfAGivenNumber(int n) {
		for(int i=2;i<=n && n>0;i++) {
			if(n%i==0) {
				while(n%i==0) {
					System.out.println(i+" ");
					n/=i;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		primeFacrorsOfAGivenNumber(n);

	}

}
