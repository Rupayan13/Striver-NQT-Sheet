/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveAllDuplicatesFromAString {
	public static boolean isPresentChar(String str, char ch) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return true;
			}
		}
		return false;
	}
	public static String removeAllDuplicatesFromAString(String str) {
		String s="";
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(!isPresentChar(s, str.charAt(i))) {
				s+=str.charAt(i);
			}
		}
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		System.out.println(removeAllDuplicatesFromAString(str));

	}

}
