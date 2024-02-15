/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FindASCIIValueOfACharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character :-");
		char ch=sc.next().charAt(0);
		int n=ch;
		System.out.println("ASCII value of "+ch+" is "+n);

	}

}
