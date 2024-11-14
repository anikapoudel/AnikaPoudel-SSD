package lab3;

import java.util.Random;

/**
 * The Driver class illustrates the capabilities of the Stats class by producing
 * random numbers and computing statistics.
 */

public class Driver {
	public static void main(String[] args) {
		final int VALUES = 10; // Constant for the number of random values

		// Create a Stats object
		Stats stats = new Stats(VALUES);

		// Random number generator
		Random random = new Random();

		// Add 10 random values to the Stats object
		for (int i = 0; i < VALUES; i++) {

			stats.addValue(random.nextInt(100)); // random number between 0 and 99
		}

		// Display the numbers stored in the Stats object
		System.out.println("Numbers stored : ");
		System.out.println(stats);

		// Display the statistics of the numbers
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinValue());
		System.out.println("Maximum value = " + stats.getMaxValue());
	}
}
