package player;

import java.util.Scanner;

public class Player {
    protected PlayerPosition position = PlayerPosition.Wingspiker; // 초기값 지정
	protected String name;
	protected int id;
	protected int point;
	protected String team;
	
	public Player() {  
	}
	
	public Player(String name, int id) {
		this.name = name; // 필드의 name과 변수 name 구분위한 this
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
	
	public void printInfo() { // static 빠진이유: 메모리에 바로 올릴 필요 없음
		System.out.println("name: " + name + " | id: " + id + " | points: " + point + " | team: " + team);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Player ID: ");
		int id = input.nextInt();
		this.setId(id); // 내 객체에 대한 각각의 값들이 input 통해 들어감
		 
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
