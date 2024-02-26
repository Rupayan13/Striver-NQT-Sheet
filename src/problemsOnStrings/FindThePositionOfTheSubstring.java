/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FindThePositionOfTheSubstring {

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
		System.out.println(str1.indexOf(str2));

	}

}
