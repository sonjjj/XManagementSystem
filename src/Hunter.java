public class Hunter {
	static int power;
	
	Hunter(int power) { // ������ �����ϴ� ������
		this.power = power;
	}
	
	public void attack() {
		Monster.stg -= this.power; // ���� ������ ������ ������ ��ŭ ���ش�
	}
}