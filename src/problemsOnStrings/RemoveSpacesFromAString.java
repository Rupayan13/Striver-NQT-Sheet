/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveSpacesFromAString {
	public static String removeSpacesFromAString(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			s+=str.charAt(i);
		}
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str=sc.nextLine();
		String ans=removeSpacesFromAString(str);
		System.out.println(ans);

	}

}
