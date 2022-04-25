package player;

import java.util.Scanner;

public class CenterPlayer extends Player {
	
	public void getUserInput(Scanner input) {
		System.out.print("Player ID: ");
		int id = input.nextInt();
		this.setId(id); // �� ��ü�� ���� ������ ������ input ���� ��
		 
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does your blocking points over 5 points? (Y/N)");
			answer = input.next().charAt(0);
			
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Player blocking points: ");
				int point = input.nextInt();
				this.setPoint(point);
				break;
			}
			
			else if (answer == 'n' || answer == 'N') {
				this.setPoint(0);
				break;
			}
			
			else {
			}
		}
		
		System.out.print("Player team: ");
		String team = input.next();
		this.setTeam(team);
	}

}