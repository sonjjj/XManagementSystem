import java.util.Scanner;

public class Monstergame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ü����? ");
		int num1 = input.nextInt();
		Monster monster = new Monster(num1); // Monster�κ��� monster ��ü ����
		monster.getStg();
		
		while(true) {
			System.out.println("������ �����ϼ���! ");
			System.out.print("����!! : ");
			int attack = input.nextInt();
			Hunter hunter = new Hunter(attack); // Hunter�κ��� hunter ��ü ����
			hunter.attack(); // attack�Լ� ȣ��
			
			if(monster.getStg()<=0) {
				System.out.println("Monster killed !");
				break; // ������ ���� 0 ���ϰ� ���� �� �ݺ��� Ż��
			}
		}
 
	}

}
