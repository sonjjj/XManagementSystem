package player;

import java.util.Scanner;

import exceptions.IDException;

public interface PlayerInput { // �ڽ� Ŭ���� ���� �޼ҵ�(����) �����ϴ� Interface �߰�
		
	public int getId();
	
	public void setId(int id) throws IDException;
	
	public void setName(String name);
	
	public void setPoint(int id);
	
	public void setTeam(String team);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setPlayerID(Scanner input);
	
	public void setPlayerName(Scanner input);
	
	public void setPlayerPoint(Scanner input);
	
	public void setPlayerTeam(Scanner input);
	
}
