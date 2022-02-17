package codingGroupTasks;

public class codingTask4 {

	public static void main(String[] args) {

		/* Create a 2D array of integers.
		Develop a program which will calculate the sum
		of even and odd numbers for that array. */


		int[][] numbers = {


		{ 1, 2, 3, 4},
		{ 5, 6, 7, 8},
		{ 9, 10, 11, 12}


		};
		int oddSum = 0;
		int evenSum = 0;


		for(int row = 0; row < numbers.length; row++) {
		for(int col = 0; col < numbers[row].length; col++) {


		if(numbers[row][col]%2 == 0) {
		evenSum += numbers[row][col];


		}else if(numbers[row][col] != 0) {
		oddSum += numbers[row][col];
		}
		}
		}
		System.out.println("The sum of all even numbers is " + evenSum + ".");
		System.out.println("The sum of all odd numbers is " + oddSum + ".");

		}

		
	}

