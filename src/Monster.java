import java.util.Scanner;

public class Monster {
	static int stg; // 괴물의 힘 필드 생성
	
	Monster(int stg) { 
		this.stg = stg;
	}
	
	public int getStg() { // 원래 괴물의 힘을 저장하는 함수
		return this.stg;
	}
	
	public int setStg(int stg) { // 공격 후 괴물의 힘을 저장하는 함수
		return this.stg = stg;
	}
}	