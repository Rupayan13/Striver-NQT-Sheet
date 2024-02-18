/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestWordInAGivenString {
	public static String largestWordInAGivenString(String str) {
		if(str.length()==0) return null;
		String s="";
		int len=0;
		int startIndex=0, endIndex=0;
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && i!=str.length()-1) {
				endIndex=i;
				s=str.substring(startIndex, endIndex);
				if(len<s.length()) {
					len=s.length();
					ans=s;
				}
				startIndex=i+1;
			}
			else if(i==str.length()-1) {
				endIndex=str.length();
				s=str.substring(startIndex, endIndex);
				if(len<s.length()) {
					len=s.length();
					ans=s;
				}
			}
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str=sc.nextLine();
		System.out.println(largestWordInAGivenString(str));

	}

}
