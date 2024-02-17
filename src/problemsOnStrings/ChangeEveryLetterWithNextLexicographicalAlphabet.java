/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ChangeEveryLetterWithNextLexicographicalAlphabet {
	public static String changeEveryLetterWithNextLexicographicalAlphabet(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				if(ch=='Z') {
					s+='A';
				}else {
					char c=(char)(ch+1);
					s+=c;
				}
			}else if(ch>='a' && ch<='z') {
				if(ch=='z') {
					s+='a';
				}else {
					char c=(char)(ch+1);
					s+=c;
				}
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
		System.out.println(changeEveryLetterWithNextLexicographicalAlphabet(str));

	}

}
