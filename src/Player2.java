public class Player2 {
	
	String name;
	int id;
	String email;
	String phone;
	
	static int numStudentsRegistered = 0; // ?
	
	public Player2() { // ���ο� ������ ����� �⺻ ������ �����
		// 
		numStudentsRegistered++; // ?
	}
	
	public Player2(String name, int id) {
		this.name = name; // �ʵ��� name�� ���� name �������� this
		this.id = id;
		numStudentsRegistered++;
	}
	
	public Player2(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		numStudentsRegistered++;
	}
	
	public void printInfo() { // static ��������: �޸𸮿� �ٷ� �ø� �ʿ� ����
		System.out.println("name: " + name);
		System.out.println(" id: " + id);
		System.out.println(" email: " + email);
		System.out.println(" phone: " + phone);
	}
	
	// �Լ� �ϳ� �� �����

}
