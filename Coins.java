/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	//Put your code here
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int cent,quarter;
		quarter = a / 25;
		cent = a % 25;
		System.out.println("Use "+quarter+" quarters"+" and "+cent+" cents");	
	}
}
