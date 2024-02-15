/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PalindromicString {
	public static boolean isPlaindrome(String str) {
		int n=str.length();
		int l=0, h=n-1;
		while(l<=h) {
			if(str.charAt(l)!=str.charAt(h)) {
				return false;
			}
			l++;
			h--;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str=sc.nextLine();
		System.out.println(isPlaindrome(str));

	}

}
