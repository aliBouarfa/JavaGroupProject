package codingGroupTasks;

public class codingTask9 {

	public static void main(String[] args) {
		int array[]= {9, 2, 50, 37};

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < array.length; i++) {

		if(array[i] > largest) {

		secondLargest = largest;
		largest = array[i];

		}else if (array[i] > secondLargest) {
		secondLargest= array[i];
		}
		}
		System.out.println("The second largest number is: " + secondLargest);

		}

}
