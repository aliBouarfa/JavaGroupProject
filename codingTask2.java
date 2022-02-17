package codingGroupTasks;

public class codingTask2 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. 
		// Print the sum of all numbers.
		
		int [][] nums= { {10, 20, 30, 40}, 
				{5, 15, 20, 25, 30}, 
				{9, 18, 27, 36, 45, 54, 63}
				}; 
				int sum = 0; 
				for (int i=0; i<nums.length; i++) {
				for (int j=0; j<nums[i].length; j++) {
				sum+=nums[i][j];
				}

				}System.out.println(sum);


	}

}
