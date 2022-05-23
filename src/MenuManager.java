import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = getObject("playermanager.ser");
		
		if (playerManager == null) {
			playerManager = new PlayerManager(input);
		}
		else {
			playerManager.input = input;
		}
				// new PlayerManager(input);
		
		selectMenu(input, playerManager);
		putObject(playerManager, "playermanager.ser");
	}
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					playerManager.addPlayer();
					logger.log("add a player");
					break;
				case 2:
					playerManager.deletePlayer();
					logger.log("delete a player");
					break;
				case 3:
					playerManager.editPlayer();
					logger.log("edit a player");
					break;
				case 4:
					playerManager.viewPlayers();
					logger.log("view players");
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("!!! Please put an integer between 1 and 5 !!!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("\n*** Player Management System Menu ***");
		System.out.println("1. Add Players");
		System.out.println("2. Delete Players");
		System.out.println("3. Edit Players");
		System.out.println("4. View Players");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5: ");
	}
	
	
	
	public static PlayerManager getObject(String filename) {
		PlayerManager playerManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			playerManager = (PlayerManager) in.readObject(); // 형 변환
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return playerManager; // 그냥 null값을 리턴
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return playerManager;
	}
	
	
	
	
	public static void putObject(PlayerManager playerManager, String filename) {
		// 저장할 객체 가져옴
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(playerManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
