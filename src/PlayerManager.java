import java.util.Scanner;

public class PlayerManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner (System.in);

		while (num != 6) {
			System.out.println("\n1. Add Players");
			System.out.println("2. Delete Players");
			System.out.println("3. Edit Players");
			System.out.println("4. View Players");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt();

			if (num == 1) {
				addStudent();
			}
			else if (num == 2) {
				deleteStudent();
			}
			else if (num == 3) {
				editStudent();
			}
			else if (num == 4) {
				viewStudent();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		
		System.out.print("Student Name: ");
		String studentName = input.next();
		
		System.out.print("Student email adress: ");
		String studentEmail = input.next();
		
		System.out.print("Student Phone number: ");
		String studentPhone = input.next();
	}
	
	public static void deleteStudent() {
        Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
		
	public static void editStudent() {
        Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
	
	public static void viewStudent() {
        Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
}
