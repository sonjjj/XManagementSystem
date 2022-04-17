 import java.util.Scanner;

public class PlayerManager {
	Player player;
	
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
