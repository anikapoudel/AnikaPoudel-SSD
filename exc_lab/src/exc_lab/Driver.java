package exc_lab;

public class Driver {
	public static void main(String[] args) {
		// Create an instance of ArrayProcessor
		ArrayProcessor ap = new ArrayProcessor();
		// Call the getArrayLength method with a sample array and store the result
		int len = ap.getArrayLength(new String[] { "one", "two", "three" });
		System.out.println("Array Length is " + len);
		// Create an instance of Menu
		Menu menu = new Menu();

		// Test displayMenuOption method with both valid and invalid options
		testMenuOption(menu, 1); // Valid option
		testMenuOption(menu, 2); // Valid option
		testMenuOption(menu, 3); // Valid option
		testMenuOption(menu, 4); // Invalid option
		testMenuOption(menu, -1); // Invalid option
	}

	/**
	 * Tests the displayMenuOption method with a given menu option, catching and
	 * handling any exceptions.
	 *
	 * @param menu   The Menu object to call displayMenuOption on.
	 * @param option The menu option to test.
	 */
	private static void testMenuOption(Menu menu, int option) {
		try {
			menu.displayMenuOption(option);
		} catch (InvalidOptionException e) {
			// Print the error message from the exception
			System.out.println(e.getMessage());
		}
	}
}
