package player;

import java.util.Scanner;

public interface PlayerInput { // �ڽ� Ŭ���� ���� �޼ҵ�(����) �����ϴ� Interface �߰�
		
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setPoint(int id);
	
	public void setTeam(String team);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
