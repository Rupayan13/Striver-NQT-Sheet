/**
 * 
 */
package ProblemsOnNumbers;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PalindromeInAGivenRange {
	public static void palindromeInAGivenRange(int l, int h) {
		for(int i=l;i<=h;i++) {
			int num=i;
			int newNum=0;
			while(num>0) {
				int digit=num%10;
				newNum=(newNum*10)+digit;
				num/=10;
			}
			if(newNum==i) {
				System.out.println(newNum+" ");
			}
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeInAGivenRange(100, 150);

	}

}
