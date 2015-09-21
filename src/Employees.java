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
 * Employees
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
	public static int n = 0;

	// arrays as employee fields
	static String[] addresses = new String[n];
	static String[] ages = new String[n];
	static String[] jobTitle = new String[n];
	static String[] names = new String[n];

	/*	*//**
			 * arrays as employee fields
			 *//*
			 * public void arraysAdding() { // arrays as employee fields
			 * String[] addresses = new String[this.getN()]; System.out.println(
			 * "Employee addresses: " + addresses.length + "\n\nEnd."); String[]
			 * ages = new String[n]; String[] jobTitle = new String[n]; String[]
			 * names = new String[n]; }
			 */

	/*
	 * public void displayEmployees() { System.out.println(
	 * "Employee addresses: " + this.addresses.length); }
	 */

	public static int getN() {
		return n;
	}

	/**
	 * input Qty Employees
	 */
	public static void inputQtyEmployees() {
		// TODO input string
		System.out.println("Enter qty employees:");
		Scanner scan = new Scanner(System.in);
		setN(Integer.parseInt(scan.nextLine()));
	}

	public static void main(String[] args) {
		Employees emp = new Employees();
		// emp.arraysAdding();
		inputQtyEmployees();
		System.out.println("Employee addresses: " + addresses.length + "\n\nEnd.");
		System.out.println("Qty Employees: " + n + "\n\nEnd.");
	}

	public static void setN(int nS) {
		n = nS;
	}
}
