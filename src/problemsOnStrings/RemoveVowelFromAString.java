/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveVowelFromAString {
	public static String removeVowelFromAString(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
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
		String ans=removeVowelFromAString(str);
		System.out.println(ans);

	}

}
