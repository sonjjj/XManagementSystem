package player;

import java.util.Scanner;

import exceptions.IDException;

public abstract class Player implements PlayerInput{ // 객체를 생성하지 않는다.
    protected PlayerPosition position = PlayerPosition.Wingspiker;
	protected String name;
	protected int id;
	protected int point;
	protected String team;
	
	public Player() {  
	}
	
	public Player(PlayerPosition position) {
		this.position = position;
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
	
	public Player(PlayerPosition position, String name, int id, int point, String team) {
		this.position = position;
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

	public void setId(int id) throws IDException{
		if (id > 25) {
			throw new IDException();
		}
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
	
	public abstract void printInfo();
	
	public void setPlayerID(Scanner input) {
		int id = 50;
		
		while (id > 25) {
			System.out.print("Player ID: ");
			id = input.nextInt();
			
			try {
				this.setId(id);
			} catch (IDException e) {
				System.out.println("Incorret player ID. please enter the right number.");
			}
		}
	}
	
	public void setPlayerName(Scanner input) {
		System.out.print("Player name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setPlayerPoint(Scanner input) {
		System.out.print("Player Point: ");
		int point = input.nextInt();
		this.setPoint(point);
	}
	
	public void setPlayerTeam(Scanner input) {
		System.out.print("Player team: ");
		String team = input.next();
		this.setTeam(team);
	}
	
	public String getPos() {
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
		return pos;
	}
}
