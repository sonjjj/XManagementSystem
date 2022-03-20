import java.util.Scanner;

public class PlayerManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner (System.in);
		
		while (num != 6) {
			System.out.println("1. Add Players");
			System.out.println("2. Delete Players");
			System.out.println("3. Edit Players");
			System.out.println("4. View Players");
			System.out.println("5. Show Players");
			System.out.println("6. Exit");
			System.out.println("\nSelect one number between 1 - 6: ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Player ID: ");
				int playerID = input.nextInt();
				
				System.out.println("Player Name: ");
				String playerName = input.next();
				
				System.out.println("Player E-mail Adress: ");
				String playerEmail = input.next();
				
				input.nextLine();
				
				System.out.println("Player Phone Number: ");
				int playerPhone = input.nextInt();
				
				break;
			case 2:
				System.out.println("Player ID: ");
				int playerID2 = input.nextInt();
				break;
			case 3:
				System.out.println("Player ID: ");
				int playerID3 = input.nextInt();
				break;
			case 4:
				System.out.print("Player ID: ");
				int PlayerID4 = input.nextInt();
				break;
			}
		}	
	}
}
