/**
 * 
 */
package problemsOnNumbers;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrimeNumberInAGivenRange {
	public static void primeNumberInAGivenRange(int l, int h) {
		for(int i=l;i<=h;i++) {
			boolean isPrime=true;
			for(int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(i+" ");
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumberInAGivenRange(10, 16);

	}

}
