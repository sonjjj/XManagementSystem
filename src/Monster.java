import java.util.Scanner;

public class Monster {
	static int stg; // ������ �� �ʵ� ����
	
	Monster(int stg) { 
		this.stg = stg;
	}
	
	public int getStg() { // ���� ������ ���� �����ϴ� �Լ�
		return this.stg;
	}
	
	public int setStg(int stg) { // ���� �� ������ ���� �����ϴ� �Լ�
		return this.stg = stg;
	}
}	