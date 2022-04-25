 import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	// Player player;  선수 한 명의 경우
	ArrayList<Player> players = new ArrayList<Player>();
	
	Scanner input;
	PlayerManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlayer() {
		Player player = new Player(); // Player 객체 생성 - 한 명에 대해 정보 받음
		System.out.print("Player ID: ");
		player.id = input.nextInt();
		 
		System.out.print("Player Name: ");
		player.name = input.next();
		
		System.out.print("Player email adress: ");
		player.email = input.next();
		
		System.out.print("Player Phone number: ");
		player.phone = input.next();
		
		players.add(player); // 배열에 new player 항목 추가
	}
	
	public void deletePlayer() {
		System.out.print("Player ID: ");
		int playerId = input.nextInt();
		int index = -1; // 배열에서 일치하는 인덱스를 못 찾았다
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).id == playerId) { // 입력받은 ID가 선수 배열에 있는 어느 하나의 Id와 같은지 비교
				// get INDEX :  하나의 요소(선수)를 가져 옴 > 객체 리턴 > .을 통해 필드 접근 가능
				
				index = i; // 해당 인덱스 저장
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
				break; // 편집 후 빠져나옴
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
