import java.util.ArrayList; 
import java.util.Scanner;

import player.CenterPlayer;
import player.LiberoPlayer;
import player.Player;
import player.PlayerPosition;
import player.SetterPlayer;
import player.PlayerInput;
import player.WingspikerPlayer;

public class PlayerManager {
	ArrayList<PlayerInput> players = new ArrayList<PlayerInput>();
	// PlayerInput���� ���� ����� ������ ����
	Scanner input;
	PlayerManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlayer() {
		int position = 0;
		PlayerInput playerinput;
		
		while (true) {
			System.out.println("1 : Wingspiker");
			System.out.println("2 : Setter");
			System.out.println("3 : Center");
			System.out.println("4 : Libero");
			System.out.print("Select num for Player Position between 1 - 4: "); // �Է¿� ���� �����ϴ� ���� �޶���
			position = input.nextInt();
			
			if (position == 1) {
				playerinput = new WingspikerPlayer(PlayerPosition.Wingspiker);
				playerinput.getUserInput(input);
				players.add(playerinput); // �迭�� new player �׸� �߰�
				break;
			}
			else if (position == 2) {
				playerinput = new SetterPlayer(PlayerPosition.Setter);
				playerinput.getUserInput(input);
				players.add(playerinput);
				break;
			}
			else if (position == 3) {
				playerinput = new CenterPlayer(PlayerPosition.Center);
				playerinput.getUserInput(input);
				players.add(playerinput);
				break;
			}
			else if (position == 4) {
				playerinput = new LiberoPlayer(PlayerPosition.Libero);
				playerinput.getUserInput(input);
				players.add(playerinput);
				break;
			}
			else {
				System.out.println("!! Select num for Player Position between 1 - 4 !!: ");
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
			
			PlayerInput playerInput = players.get(i);
			
			if (playerInput.getId() == playerId) {
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
						playerInput.setId(id);
					}
					else if (num == 2) {
						System.out.print("Player name: ");
						String name = input.next();
						playerInput.setName(name);
					}
					else if (num == 3) {
						System.out.print("Player Point: ");
						int point = input.nextInt();
						playerInput.setPoint(point);
					}
					else if (num == 4) {
						System.out.print("Player team: ");
						String team = input.next();
						playerInput.setTeam(team);
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
