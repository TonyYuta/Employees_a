import java.util.Scanner;

/**
 *   File Name: Employees.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Sep 20, 2015
 *   
 *   Create an application which enters employees into the system. 
 *   You will need to enter them in sets. The program should ask how many employees 
 *   they want to enter and than insert them into arrays (String[] names, String[] addresses, 
 *   String[]/ int[] ages, String[] jobTitles[]). You should use the Scanner class, 
 *   the method nextLine. Review any of the old applications for help as well as the 
 *   notes on arrays. The program should ask the user if they would like to exit the 
 *   system or add a new set of employees (while loop). It than does the same process 
 *   to create additional employees (The tricky part here is to remember that arrays 
 *   have a downside of requiring that the size be specified, it will be challenging 
 *   to add an additional set of employees to the array *You must create a new array 
 *   that contains all elements from both previous execution and past execution). 
 *   If the user decides to exit the system, you should display all employees 
 *   in the system and than exit.
 */

/**
 * Employees //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Employees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// allow user input;
		System.out.println("How many employees do you want to enter?");
		int num = input.nextInt();

		String names[] = new String[num];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the name of employee " + (i + 1) + " :");
			names[i] = input.nextLine();
		}

		String addresses[] = new String[num];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the address for employee " + (i + 1) + " :");
			addresses[i] = input.nextLine();
		}

		String ages[] = new String[num];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the age for employee " + (i + 1) + " :");
			ages[i] = input.nextLine();
		}

		String jobTitles[] = new String[num];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the jobTitles for employee " + (i + 1) + " :");
			jobTitles[i] = input.nextLine();
		}

		// close the scanner
		input.close();

		// message that all elements have been stored in the arrays
		// names[], addresses[], ages, and jobTitles[]
		System.out.println("These are the employees you have entered.");
		/*
		 * printArray(names), printArray(addresses), printArray(ages),
		 * printArray(jobTitles)
		 */
		printArrays(names, addresses, ages, jobTitles);
	}

	// this method prints the elements in an arrays
	/**
	 * @param arrNames
	 * @param arrAddresses
	 * @param arrAges
	 * @param arrJobTitles
	 */
	public static void printArrays(String arrNames[], String arrAddresses[], String arrAges[], String arrJobTitles[]) {

		int n = arrNames.length;

		for (int i = 0; i < n; i++) {
			System.out.print("Name: " + arrNames[i] + " Address: " + arrAddresses[i] + " Age: " + arrAges[i]
					+ " Job Title: " + arrJobTitles[i] + "\n");
		}
		System.out.println("\n");
	}

}