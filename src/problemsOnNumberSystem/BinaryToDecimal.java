/**
 * 
 */
package problemsOnNumberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinaryToDecimal {
	public static int binaryToDecimal(String str) {
		int n=str.length();
		int p=0;
		int sum=0;
		for(int i=n-1;i>=0;i--) {
			if(str.charAt(i)=='1') {
				sum+=(int)Math.pow(2, p);
			}
			p++;
		}
		return sum;
	}
	public static int binaryToDecimal1(String str) {
		int n=str.length();
		int base = 1;
	    int ans = 0;
	    for (int i = n - 1; i >= 0; i--) {
	      if (str.charAt(i) == '1') {
	        ans += base;
	      }
	      base *= 2;
	    }
	    return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		String str=sc.nextLine();
		System.out.println(binaryToDecimal1(str));

	}

}
