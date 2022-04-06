import java.util.Scanner;

public class Monstergame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("괴물의 체력은? ");
		int num1 = input.nextInt();
		Monster monster = new Monster(num1); // Monster로부터 monster 객체 생성
		monster.getStg();
		
		while(true) {
			System.out.println("괴물을 공격하세요! ");
			System.out.print("공격!! : ");
			int attack = input.nextInt();
			Hunter hunter = new Hunter(attack); // Hunter로부터 hunter 객체 생성
			hunter.attack(); // attack함수 호출
			
			if(monster.getStg()<=0) {
				System.out.println("Monster killed !");
				break; // 괴물의 힘이 0 이하가 됐을 때 반복문 탈출
			}
		}
 
	}

}
