package day7;

public class MissingNumber {

	public static void main(String[] args) {
		
		        // Example array from 1 to 10 with one number missing
		        int[] numbers = {1, 3, 4, 5, 6, 7, 8, 9, 10};

		        int n = numbers.length + 1; // Since one number is missing
		        int totalSum = n * (n + 1) / 2; // Sum of 1 to n
		        int arraySum = 0;

		        for (int num : numbers) {
		            arraySum += num;
		        }

		        int missingNumber = totalSum - arraySum;

		        System.out.println("The missing number is: " + missingNumber);
		    }
		


	}


