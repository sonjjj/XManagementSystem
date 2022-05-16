import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.IDException;
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
		
		while (position < 1 || position > 4) {
			try {
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
			catch (InputMismatchException e){
				System.out.println("!!! Please put an integer between 1 and 4 !!!");
				if(input.hasNext()) {
					input.next();
				}
				position = 0;
			}
		}
	}
	
	public void deletePlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		int index = findIndex(playerId) ;
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getId() == playerId) { // 입력받은 ID가 선수 배열에 있는 어느 하나의 Id와 같은지 비교
				// get INDEX :  하나의 요소(선수)를 가져 옴 > 객체 리턴 > .을 통해 필드 접근 가능
				
				index = i; // 해당 인덱스 저장
				break;
			}
		}
		removefromPlayers(index, playerId);
	}
	
	public int findIndex(int playerId) {
		int index = -1;
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getId() == playerId) { // 입력받은 ID가 선수 배열에 있는 어느 하나의 Id와 같은지 비교
				// get INDEX :  하나의 요소(선수)를 가져 옴 > 객체 리턴 > .을 통해 필드 접근 가능
				
				index = i; // 해당 인덱스 저장
				break;
			}
		}
		return index;
	}
	public int removefromPlayers(int index, int playerId) {
		if (index > -1) { 
			players.remove(index);
			System.out.println("! the player " + playerId +" has deleted !");
			return 1;
		}
		
		else { // 배열에서 일치하는 인덱스를 못 찾은 경우
			System.out.println("the student has not been registered");
			return -1;
		}
	}
	public void editPlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		
		for (int i = 0; i < players.size(); i++) {
			
			PlayerInput player = players.get(i);
			
			if (player.getId() == playerId) {
				int num = -1;
				while (num != 5) {
					showEditMenu(); // 메뉴보여주는 함수로 바꿈
					num = input.nextInt();
					
					switch(num) {
					case 1: // 선수 ID
						player.setPlayerID(input);
						break;
					case 2: // 선수 이름
						player.setPlayerName(input);
						break;
					case 3: // 점수
						player.setPlayerPoint(input);
						break;
					case 4: // 소속 팀
						player.setPlayerTeam(input);
						break;
					default:
						continue;	
					}
				} 
				System.out.println("the player to be edited is " + playerId);
				break; // 편집 후 빠져나옴
			}
		}
	}
	
	public void viewPlayers() {
		System.out.println("# of registered players: " + players.size());
		
		for (int i = 0; i < players.size(); i++) {
			players.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("** Edit Menu **");
		System.out.println("1. Edit ID");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Points");
		System.out.println("4. Edit team");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5: ");
	}
}
