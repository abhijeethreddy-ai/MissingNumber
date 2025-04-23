MissingNumber is a simple Java program that finds a missing number in an array containing distinct integers from 1 to n (inclusive), where exactly one number is missing. It uses the mathematical formula for the sum of the first n natural numbers to identify the missing value.

Features
Detects a missing number from a sequence of integers from 1 to n.

Uses efficient O(n) time complexity with constant space.

Simple, clean logic using arithmetic.

Code Example
java
Copy
Edit
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
How It Works
The sum of the first n natural numbers is calculated using the formula:

ini
Copy
Edit
Sum = n * (n + 1) / 2
By subtracting the actual sum of the elements in the array from the expected sum, the result is the missing number.

How to Run
Ensure Java is installed on your system.

Save the file as MissingNumber.java.

Open your terminal or command prompt.

Compile the program:

nginx
Copy
Edit
javac MissingNumber.java
Run the program:

nginx
Copy
Edit
java MissingNumber
Sample Output
csharp
Copy
Edit
The missing number is: 2
