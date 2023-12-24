/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int num1 ,num2 ,num3 ,min=0 ;
		num1 = (int)(Math.random()*(b - a) + a);
		num2 = (int)(Math.random()*(b - a) + a);
		num3 = (int)(Math.random()*(b - a) + a);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		if(num1 <= num2 && num1 <= num3) {
			min = num1;
		}
		if(num2 <= num1 && num2 <= num3) {
			min = num2;
		}
		if(num3 <= num1 && num3 <= num2) {
			min = num3;
		}
		System.out.println("The minimal generated number was "+min);
	}
}
