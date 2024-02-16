/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CapitalizeFirstAndLastCharacterForEachWord {
	public static String capitalizeFirstAndLastCharacterForEachWord(String str) {
		StringBuilder sb=new StringBuilder(str);
		boolean isCapitalize=false;
		for(int i=0;i<sb.length();i++) {
			if((i==0 && (sb.charAt(i)>='a' && sb.charAt(i)<='z')) || (i==sb.length()-1 && (sb.charAt(i)>='a' && sb.charAt(i)<='z'))) {
				char ch=(char)((int)sb.charAt(i)-32) ;
				sb.setCharAt(i, ch);
			}else {
				char ch=sb.charAt(i);
				if(sb.charAt(i+1)==' ' && (sb.charAt(i)>='a' && sb.charAt(i)<='z')) {
					char c=(char)((int)sb.charAt(i)-32) ;
					sb.setCharAt(i, c);
				}
				else if(ch==' ') {
					isCapitalize=true;
				}
				else if(isCapitalize==true && (sb.charAt(i)>='a' && sb.charAt(i)<='z')) {
					char c=(char)((int)sb.charAt(i)-32) ;
					sb.setCharAt(i, c);
					isCapitalize=false;
				}else {
					isCapitalize=false;
				}
			}
		}
		return new String(sb);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		System.out.println(capitalizeFirstAndLastCharacterForEachWord(str));

	}

}
