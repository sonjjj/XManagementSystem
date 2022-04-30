package player;

import java.util.Scanner;

public class LiberoPlayer extends Player {
	
//	protected int defensepoint;
//	protected String businessteam;
	
	public LiberoPlayer(PlayerPosition position) {
		super(position);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
//		System.out.println("Player receiving points: 0");
//		this.setPoint(0);
		
		char answer1 = 'x';
		while (answer1 != 'y' && answer1 != 'Y' && answer1 != 'n' && answer1 != 'N')
		{
			System.out.print("? Are you on the starting list ?");
			answer1 = input.next().charAt(0);
			
			if (answer1 == 'y' || answer1 == 'Y') {
				System.out.print("Player defensing points: ");
				int point = input.nextInt();
				this.setPoint(point);
				break;
			}
			
			else if (answer1 == 'n' || answer1 == 'N') {
				this.setPoint(0);
				break;
			}
			
			else {
			}
		}
		
		///
		
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 != 'N')
		{
			System.out.print("? Do you work for a primere v-league ?");
			answer2 = input.next().charAt(0);
			
			if (answer2 == 'y' || answer2 == 'Y') { // 프로 팀의 경우
				System.out.print("Player team: ");
				String team = input.next();
				this.setTeam(team);
				break;
			}
			
			else if (answer2 == 'n' || answer2 == 'N') {  // 실업 팀인 경우
				this.setTeam("-businessteam-");
				break;
			}
			
			else {
			}
		}
	}
	
	public void printInfo() { // 추가 정보 출력
		// 선수 종류에 따라 바뀔 예정	
			String pos = "none";
			
			switch(this.position) {
			case Wingspiker:
				pos = "Wing";
				break;
			case Setter:
				pos = "Setter";
				break;
			case Center:
				pos = "Center";
				break;
			case Libero:
				pos = "Libero";
				break;
			default: //모든 케이스가 아닌 경우
				
			}
			
			System.out.println("position: " + pos + " | name: " + name + " | id: " + id + " | Defense points: " + point + " | team: " + team);
		}

}
