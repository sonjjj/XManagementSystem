 import java.util.Scanner;

public class PlayerManager {
	Player player; // 선수 한 명의 경우
	
	Scanner input;
	PlayerManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlayer() {
		player = new Player();
		System.out.print("Player ID: ");
		player.id = input.nextInt();
		 
		System.out.print("Player Name: ");
		player.name = input.next();
		
		System.out.print("Player email adress: ");
		player.email = input.next();
		
		System.out.print("Player Phone number: ");
		player.phone = input.next();
	}
	
	public void deletePlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		if (player == null) {
			System.out.println("the player has not been registered");
			return;
		}
		if (player.id == playerId) {
			player = null;
			System.out.println("the player has deleted"); //확인용
		}
	}
		
	public void editPlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		if (player.id == playerId) {
			int num = -1;
			while (num != 5) {
				System.out.println("\n1. Add Players");
				System.out.println("2. Delete Players");
				System.out.println("3. Edit Players");
				System.out.println("4. View Players");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1 - 5: ");
				num = input.nextInt();

				if (num == 1) {
					System.out.print("Player ID: ");
					player.id = input.nextInt();
				}
				else if (num == 2) {
					System.out.print("Player name: ");
					player.name = input.next();
				}
				else if (num == 3) {
					System.out.print("Email: ");
					player.email = input.next();
				}
				else if (num == 4) {
					System.out.print("Player phone number: ");
					player.phone = input.next();
				}
				else {
					continue;
				}
			}
			System.out.println("the player to be edited is " + playerId); ///// 수정
		}
	}
	
	public void viewPlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		if (player.id == playerId) {
			player.printInfo();
		}
	}

}
