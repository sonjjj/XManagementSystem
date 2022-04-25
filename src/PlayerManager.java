 import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	// Player player;  ���� �� ���� ���
	ArrayList<Player> players = new ArrayList<Player>();
	
	Scanner input;
	PlayerManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlayer() {
		Player player = new Player(); // Player ��ü ���� - �� �� ���� ���� ����
		System.out.print("Player ID: ");
		player.id = input.nextInt();
		 
		System.out.print("Player Name: ");
		player.name = input.next();
		
		System.out.print("Player email adress: ");
		player.email = input.next();
		
		System.out.print("Player Phone number: ");
		player.phone = input.next();
		
		players.add(player); // �迭�� new player �׸� �߰�
	}
	
	public void deletePlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		int index = -1; // �迭���� ��ġ�ϴ� �ε����� �� ã�Ҵ�
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).id == playerId) { // �Է¹��� ID�� ���� �迭�� �ִ� ��� �ϳ��� Id�� ������ ��
				// get INDEX :  �ϳ��� ���(����)�� ���� �� > ��ü ���� > .�� ���� �ʵ� ���� ����
				
				index = i; // �ش� �ε��� ����
				break;
			}
		}
		
		
		if (index > -1) {
			players.remove(index);
			System.out.println("! the player " + playerId +" has deleted !");
		}
		
		else {
			System.out.println("the student has not been registered");
			return;
		}
		
	}
		
	public void editPlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		for (int i = 0; i < players.size(); i++) {
			
			Player player = players.get(i);
			
			if (player.id == playerId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Edit Menu **");
					System.out.println("1. Edit ID");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit phone");
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
					} // if
				} // while
				System.out.println("the player to be edited is " + playerId);
				break; // ���� �� ��������
			} // if
		} // for
	}
	
	public void viewPlayers() {
//		System.out.print("Player ID: ");
//		int playerId = input.nextInt();
		
		for (int i = 0; i < players.size(); i++) {
			players.get(i).printInfo();
		}
	}

}
