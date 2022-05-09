package player;

import java.util.Scanner;

public abstract class Player { // 객체를 생성하지 않는다.
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
	
	public abstract void printInfo();
	
}
