/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ConcatenateOneStringToAnother {
	public static String concatenateOneStringToAnother(String str1, String str2) {
		return str1+str2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string :-");
		String str1=sc.nextLine();
		System.out.println("Enter the second string :-");
		String str2=sc.nextLine();
		System.out.println(concatenateOneStringToAnother(str1, str2));

	}

}
