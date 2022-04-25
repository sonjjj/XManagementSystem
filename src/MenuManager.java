import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = new PlayerManager(input);
		
		int num = -1;

		while (num != 5) {
			System.out.println("\n*** Player Management System Menu ***");
			System.out.println("1. Add Players");
			System.out.println("2. Delete Players");
			System.out.println("3. Edit Players");
			System.out.println("4. View Players");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
			num = input.nextInt();

			if (num == 1) {
				playerManager.addPlayer();
			}
			else if (num == 2) {
				playerManager.deletePlayer();
			}
			else if (num == 3) {
				playerManager.editPlayer();
			}
			else if (num == 4) {
				playerManager.viewPlayers();
			}
			else {
				continue;
			}
		}
	}
}
