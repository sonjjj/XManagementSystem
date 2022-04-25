import java.util.ArrayList;
import java.util.Scanner;

import player.CenterPlayer;
import player.LiberoPlayer;
import player.Player;
import player.SetterPlayer;
import player.WingspikerPlayer;

public class PlayerManager {
	ArrayList<Player> players = new ArrayList<Player>();
	
	Scanner input;
	PlayerManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlayer() {
		int position = 0;
		Player player;
		
		while (true) {
			System.out.println("1 : Wingspiker");
			System.out.println("2 : Setter");
			System.out.println("3 : Center");
			System.out.println("4 : Libero");
			System.out.print("Select num for Player Position between 1 - 4: "); // �Է¿� ���� �����ϴ� ���� �޶���
			position = input.nextInt();
			
			if (position == 1) {
				player = new WingspikerPlayer();
				player.getUserInput(input);
				players.add(player); // �迭�� new player �׸� �߰�
				break;
			}
			else if (position == 2) {
				player = new SetterPlayer();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if (position == 3) {
				player = new CenterPlayer();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if (position == 4) {
				player = new LiberoPlayer();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else {
				System.out.print("Select num for Player Position between !! 1 - 4 !!: ");
			}
		}
	}
	
	public void deletePlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		int index = -1;
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getId() == playerId) { // �Է¹��� ID�� ���� �迭�� �ִ� ��� �ϳ��� Id�� ������ ��
				// get INDEX :  �ϳ��� ���(����)�� ���� �� > ��ü ���� > .�� ���� �ʵ� ���� ����
				
				index = i; // �ش� �ε��� ����
				break;
			}
		}
		
		
		if (index > -1) { 
			players.remove(index);
			System.out.println("! the player " + playerId +" has deleted !");
		}
		
		else { // �迭���� ��ġ�ϴ� �ε����� �� ã�� ���
			System.out.println("the student has not been registered");
			return;
		}
		
	}
		
	public void editPlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		for (int i = 0; i < players.size(); i++) {
			
			Player player = players.get(i);
			
			if (player.getId() == playerId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Edit Menu **");
					System.out.println("1. Edit ID");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Points");
					System.out.println("4. Edit team");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5: ");
					num = input.nextInt();

					if (num == 1) {
						System.out.print("Player ID: ");
						int id = input.nextInt();
						player.setId(id);
					}
					else if (num == 2) {
						System.out.print("Player name: ");
						String name = input.next();
						player.setName(name);
					}
					else if (num == 3) {
						System.out.print("Player Point: ");
						int point = input.nextInt();
						player.setPoint(point);
					}
					else if (num == 4) {
						System.out.print("Player team: ");
						String team = input.next();
						player.setTeam(team);
					}
					else {
						continue;
					} 
					break;// if
				} // while
				System.out.println("the player to be edited is " + playerId);
				 // ���� �� ��������
			} // if
		} // for
	}
	
	public void viewPlayers() {
		System.out.println("# of registered players: " + players.size());
		
		for (int i = 0; i < players.size(); i++) {
			players.get(i).printInfo();
		}
	}

}
