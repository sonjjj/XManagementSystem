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
	// PlayerInput으로 넣은 결과의 내용을 나열
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
			System.out.print("Select num for Player Position between 1 - 4: "); // 입력에 따라 생성하는 내용 달라짐
			position = input.nextInt();
			
			if (position == 1) {
				playerinput = new WingspikerPlayer(PlayerPosition.Wingspiker);
				playerinput.getUserInput(input);
				players.add(playerinput); // 배열에 new player 항목 추가
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
			if (players.get(i).getId() == playerId) { // 입력받은 ID가 선수 배열에 있는 어느 하나의 Id와 같은지 비교
				// get INDEX :  하나의 요소(선수)를 가져 옴 > 객체 리턴 > .을 통해 필드 접근 가능
				
				index = i; // 해당 인덱스 저장
				break;
			}
		}
		
		
		if (index > -1) { 
			players.remove(index);
			System.out.println("! the player " + playerId +" has deleted !");
		}
		
		else { // 배열에서 일치하는 인덱스를 못 찾은 경우
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
				 // 편집 후 빠져나옴
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
