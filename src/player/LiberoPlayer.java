package player;

import java.util.Scanner;

public class LiberoPlayer extends Player {
	
	public void getUserInput(Scanner input) {
		System.out.print("Player ID: ");
		int id = input.nextInt();
		this.setId(id); // �� ��ü�� ���� ������ ������ input ���� ��
		
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.println("Player receiving points: 0");
		this.setPoint(0);
		
		System.out.print("Player team: ");
		String team = input.next();
		this.setTeam(team);
	}

}
