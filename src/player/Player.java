public class Player {
	String name;
	int id;
	String email;
	String phone;
	
	public Player() { 
	}
	
	public Player(String name, int id) {
		this.name = name; // �ʵ��� name�� ���� name �������� this
		this.id = id;
	}
	
	public Player(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public void printInfo() { // static ��������: �޸𸮿� �ٷ� �ø� �ʿ� ����
		System.out.println("name: " + name + "| id: " + id + "| email: " + email + "| phone: " + phone);
	}
	
	// �Լ� �ϳ� �� �����

}
