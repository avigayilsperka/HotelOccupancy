/* Avigayil Marcus
   Program1
   2/17/2022 */

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// variables
		int numfloor, numroom, full;

		// Collect # of floors with input validation
		do {
			System.out.println("Enter the number of floors in the hotel. (Only numbers 1 or greater): ");
			numfloor = input.nextInt();
		} while (numfloor < 1);

		// set accumulator
		int totalroom = 0, totalfull = 0;

		// for loop per floor
		for (int x = 1; x <= numfloor; x++) {

			// collect # of rooms per floor
			do {
				System.out.printf("Enter the number of rooms on floor %d. (Only numbers greater than 10):", x);
				numroom = input.nextInt();
			} while (numroom < 10);

			// collect # of occupied rooms
			do {
				System.out.println(
						"Enter the number of occupied rooms on the floor.(Number may not exceed the number of rooms): ");
				full = input.nextInt();
			} while (full < 0 || full > numroom);

			// calculate totals of rooms
			totalroom += numroom;
			totalfull += full;

		}

		System.out.printf("Total rooms in the hotel: %d\n", totalroom);
		System.out.printf("Total occupied rooms: %d\n", totalfull);
		System.out.printf("Total vacant rooms: %d\n", totalroom - totalfull);
		System.out.printf("Hotel occupancy rate: %.2f%%", (double) totalfull / totalroom * 100);
		input.close();

	}

}
