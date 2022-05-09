package player;

import java.util.Scanner;

public interface PlayerInput { // 자식 클래스 공통 메소드(선언) 공유하는 Interface 추가
		
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setPoint(int id);
	
	public void setTeam(String team);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
