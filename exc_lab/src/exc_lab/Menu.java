package exc_lab;

public class Menu {
	/**
	 * Displays the selected menu option.
	 * 
	 * @param opt The menu option to display, expected to be in the range of 1 to 3.
	 * @throws InvalidOptionException if the option is not between 1 and 3.
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		switch (opt) {
		case 1:
			System.out.println("Menu option 1 selected");
			break;
		case 2:
			System.out.println("Menu option 2 selected");
			break;
		case 3:
			System.out.println("Menu option 3 selected");
			break;
		default:
			// Throwing custom exception if option is out of range
			throw new InvalidOptionException("Invalid option: " + opt + ". Please select an option between 1 and 3.");
		}
	}

}
