import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ArrayList of people
		Scanner in = new Scanner(System.in);
		ArrayList<People> people = new ArrayList<>();
		int choice, peopleChoice;
		// loop while they don't say quit
		do {

			Menu();
			// read in option
			choice = in.nextInt();

			switch (choice) {
			case 1:
				// if 1
				// flush the buffer
				in.nextLine();
				// read in name
				System.out.println("What is the name?");
				String name = in.nextLine();
				// make a person
				people.add(new People(name));
				// add them to the list
				break;
			case 2:
				// if 2
				// print list of people
				PrintPeople(people);
				// read in which person
				peopleChoice = in.nextInt() - 1;
				if (peopleChoice >= 0 && peopleChoice < people.size()) {
					// read in value
					System.out.println("What value do you want to add?");
					int value = in.nextInt();
					// add value to selected person
					people.get(peopleChoice).addValue(value);
				} else {
					System.out.println("Not a valid person");
				}
				break;
			case 3:
				// if 3
				// print list of people
				PrintPeople(people);
				// read in which person
				peopleChoice = in.nextInt() - 1;
				// print out max
				System.out.println("Max: " + people.get(peopleChoice).getMax());
				// print out min
				System.out.println("Min: " + people.get(peopleChoice).getMin());
				// print out avg
				System.out.println("Avg: " + people.get(peopleChoice).getAvg());
				break;
			case 4:
				// if 4
				// say goodbye
				System.out.println("Goodbye!");
				break;

			default:
				System.out.println("Not a valid option\n");
				break;
			}
		} while (choice != 4);

	}

	public static void Menu() {
		// options are
		// 1 - add person
		// 2 - add a value
		// 3 - get a person's info
		// 4 - quit
		System.out.println("Make your selection:");
		System.out.println("1. Add a person");
		System.out.println("2. Add a value");
		System.out.println("3. See information");
		System.out.println("4. Quit");
	}

	public static void PrintPeople(ArrayList<People> p) {
		System.out.println("Choose your person");
		for (int x = 0; x < p.size(); x++) {
			System.out.println((x + 1) + ") " + p.get(x).getName());
		}

	}
}
