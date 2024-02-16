/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveCharactersFromFirstStringPresentInSecondString {
	public static boolean isPresentChar(String str, char ch) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return true;
			}
		}
		return false;
	}
	public static String removeCharactersFromFirstStringPresentInSecondString(String str1, String str2) {
		String s="";
		for(int i=0;i<str1.length();i++) {
			if(!isPresentChar(str2, str1.charAt(i))) {
				s+=str1.charAt(i);
			}
		}
		return s;
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
		str1=removeCharactersFromFirstStringPresentInSecondString(str1, str2);
		System.out.println(str1);

	}

}
