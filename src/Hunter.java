public class Hunter {
	static int power;
	
	Hunter(int power) { // 공격을 리턴하는 생성자
		this.power = power;
	}
	
	public void attack() {
		Monster.stg -= this.power; // 원래 괴물의 힘에서 공격한 만큼 빼준다
	}
}