/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ChangeCaseOfEachCharacterInAString {
	public static String changeCaseOfEachCharacterInAString(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				s+=(char)(ch+32);
			}else if(ch>='a' && ch<='z') {
				s+=(char)(ch-32);
			}else {
				s+=ch;
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
		System.out.println("Enter the string :-");
		String str=sc.nextLine();
		System.out.println(changeCaseOfEachCharacterInAString(str));

	}

}
