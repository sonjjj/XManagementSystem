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
				addPlayer();
			}
			else if (num == 2) {
				deletePlayer();
			}
			else if (num == 3) {
				editPlayer();
			}
			else if (num == 4) {
				viewPlayer();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addPlayer() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		System.out.print("Player Name: ");
		String playerName = input.next();
		
		System.out.print("Player email adress: ");
		String playerEmail = input.next();
		
		System.out.print("Player Phone number: ");
		String playerPhone = input.next();
	}
	
	public static void deletePlayer() {
        Scanner input = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
	}
		
	public static void editPlayer() {
        Scanner input = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
	}
	
	public static void viewPlayer() {
        Scanner input = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
	}
}
