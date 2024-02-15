/**
 * 
 */
package problemsOnStrings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CountNumberOfVowelsConsonentsAndSpaces {
	public static void countNumberOfVowelsConsonentsAndSpaces(String str) {
		int n = str.length();
		str = str.toUpperCase();
		int countVowel = 0, countConsonents = 0, countSpaces = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U') {
					countVowel++;
				} else {
					countConsonents++;
				}
			} else if (str.charAt(i) == ' ') {
				countSpaces++;
			}
		}
		System.out.println("Number of Vowels :-" + countVowel);
		System.out.println("Number of Consonents :-" + countConsonents);
		System.out.println("Number of Spaces :-" + countSpaces);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :-");
		String str = sc.nextLine();
		countNumberOfVowelsConsonentsAndSpaces(str);

	}

}
