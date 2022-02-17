package codingGroupTasks;

import java.util.Scanner;

public class codingTask1 {

	public static void main(String[] args) {
		
		//Create an array on int values using a scanner 
		//and calculate the sum of all stored elements in that array. 
		
		Scanner num = new Scanner(System.in);

		System.out.println("Enter value press enter ");
		int num1 = num.nextInt();
		System.out.println("Enter value press enter ");
		int num2 = num.nextInt();
		System.out.println("Enter value press enter ");
		int num3 = num.nextInt();
		System.out.println("Enter value press enter ");
		int num4 = num.nextInt();

		int[] numbers = { num1, num2, num3, num4 };
		int size = numbers.length;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of all elements in the array= " + sum);

	}
}


