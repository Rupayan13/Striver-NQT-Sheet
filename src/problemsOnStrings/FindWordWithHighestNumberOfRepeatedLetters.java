/**
 * 
 */
package problemsOnStrings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FindWordWithHighestNumberOfRepeatedLetters {
	public static int numberOfRepeatingCharacters(String str) {
		int count=0;
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!freq.containsKey(ch)) {
				freq.put(ch, 1);
			} else {
				freq.put(ch, freq.get(ch) + 1);
			}
		}
		for (var e : freq.keySet()) {
			if (freq.get(e) > 1) {
				count++;
			}
		}
		return count;
	}
	public static String findWordWithHighestNumberOfRepeatedLetters(String str) {
		String s="";
		String ans="";
		int num=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				int n=numberOfRepeatingCharacters(s);
				if(num<n) {
					num=n;
					ans=s;
				}
				s="";
			}else {
				s+=ch;
			}
		}
		int n=numberOfRepeatingCharacters(s);
		if(num<n) {
			num=n;
			ans=s;
		}
		if(num==0) {
			return "No Word";
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
		System.out.println(findWordWithHighestNumberOfRepeatedLetters(str));

	}

}
