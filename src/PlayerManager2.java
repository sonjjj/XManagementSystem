import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager2 {
	
	String ID;
	String Name;
	String Email;
	String Phone;
	Scanner input; // ?

	public PlayerManager2(Scanner input) { // ??
		this.input = input;
	}
	
	//public PlayerManager2(String ID, String Name, String Email, String Phone) { // Ŭ���� ���� �ʵ带 �����ڸ� ȣ���� ������ �� �ֵ��� ��
	//	this.ID = ID;
	//	this.Name = Name;
	//	this.Email = Email;
	//	this.Phone = Phone;
	//}
	
	public static ArrayList<String> addPlayer() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> player = new ArrayList<String>();
		
		System.out.print("Player ID: ");
		String ID = input.next();
		player.add(ID);
		
		System.out.print("Player Name: ");
		String Name = input.next();
		player.add(Name);
		
		System.out.print("Player email adress: ");
		String Email = input.next();
		player.add(Email);
		
		System.out.print("Player Phone number: ");
		String Phone = input.next();
		player.add(Phone);
		
		return player;
	}
	
	public static void deletePlayer(ArrayList<String> p) {
		p.removeAll(p);
		System.out.println("�����Ǿ����ϴ�!");
	}
		
	public static void editPlayer(ArrayList<String> p) {
		
		System.out.println("1. ID 2. �̸� 3. �̸��� 4. ��ȭ��ȣ");	
		System.out.println("������ �׸���?: ");
		
		Scanner input = new Scanner(System.in);
		int editnum = input.nextInt();
		
		if (editnum == 1) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("ID�� ���� �ٲٽðھ��? ");
			String ID = input1.next();
			p.set(0, ID);
		}
		if (editnum == 2) {
			Scanner input2 = new Scanner(System.in);
			System.out.println("�̸��� ���� �ٲٽðھ��? ");
			String name = input2.next();
			p.set(0, name);
			
		}
		if (editnum == 3) {
			Scanner input3 = new Scanner(System.in);
			System.out.println("�̸����� ���� �ٲٽðھ��? ");
			String Email = input3.next();
			p.set(0, Email);
		}
		if (editnum == 4) {
			Scanner input4 = new Scanner(System.in);
			System.out.println("��ȭ��ȣ�� ���� �ٲٽðھ��? ");
			String Phone = input4.next();
			p.set(0, Phone);
		}
		
		
	}
	 
	public static void viewPlayer(ArrayList<String> p) {
		System.out.println(p);
	}

}
