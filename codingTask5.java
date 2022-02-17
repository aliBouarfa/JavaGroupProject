package codingGroupTasks;

public class codingTask5 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable
		 * 
		 * Example: X= 25 (First number), Y= 23 (second number) Swapping Logic: X = X +
		 * Y = 25 +23 = 48 Y = X - Y = 48 - 23 = 25 X = X -Y = 48 - 25 = 23 and the
		 * numbers are swapped as X =23 and Y =25.
		 * 
		 */

		int x = 38;
		int y = 18;

		System.out.println("Before swapping a = " + x + " and b = " + y);

		x = x + y; // a = 38 + 18 = 56
		y = x - y; // b = 56 - 18 = 38
		x = x - y; // a = 56 - 38 = 18

		System.out.println("After swapping a = " + x + " and b = " + y);

	}

}
