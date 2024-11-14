package exc_lab;

public class ArrayProcessor {
	// Method to get the length of the array by iterating through it until an
	// exception is thrown
	int getArrayLength(Object[] a) {
		// Initialize a counter variable to keep track of the number of elements
		int count = 0;
		// Infinite loop to access each element of the array until an exception is
		// thrown
		try {
			while (true) {
				Object t = a[count]; // Access the element at the current index
				System.out.println(t); // Example usage of t
				count++; // Increment the count
			}

			// Catch the exception thrown when the index goes out of bounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("finished");

		}
		return count;// Return the count as the length of the array

	}
}
