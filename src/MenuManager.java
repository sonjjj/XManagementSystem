import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = new PlayerManager(input);
		
		selectMenu(input, playerManager);
		}
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					playerManager.addPlayer();
					break;
				case 2:
					playerManager.deletePlayer();
					break;
				case 3:
					playerManager.editPlayer();
					break;
				case 4:
					playerManager.viewPlayers();
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("!!! Please put an integer between 1 and 5 !!!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("\n*** Player Management System Menu ***");
		System.out.println("1. Add Players");
		System.out.println("2. Delete Players");
		System.out.println("3. Edit Players");
		System.out.println("4. View Players");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5: ");
	}
}
