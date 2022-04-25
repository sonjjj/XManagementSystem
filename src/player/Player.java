package player;

import java.util.Scanner;

public class Player {
    protected PlayerPosition position = PlayerPosition.Wingspiker; // �ʱⰪ ����
	protected String name;
	protected int id;
	protected int point;
	protected String team;
	
	public Player() {  
	}
	
	public Player(String name, int id) {
		this.name = name; // �ʵ��� name�� ���� name �������� this
		this.id = id;
	}
	
	public Player(String name, int id, int point, String team) {
		this.name = name;
		this.id = id;
		this.point = point;
		this.team = team;
	}
	
	public PlayerPosition getPosition() {
		return position;
	}

	public void setPosition(PlayerPosition position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public void printInfo() { // static ��������: �޸𸮿� �ٷ� �ø� �ʿ� ����
		System.out.println("name: " + name + " | id: " + id + " | points: " + point + " | team: " + team);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player ID: ");
		int id = input.nextInt();
		this.setId(id); // �� ��ü�� ���� ������ ������ input ���� ��
		 
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Player points: ");
		int point = input.nextInt();
		this.setPoint(point);
		
		System.out.print("Player team: ");
		String team = input.next();
		this.setTeam(team);
	}

}
