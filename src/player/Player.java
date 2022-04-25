public class Player {
	String name;
	int id;
	String email;
	String phone;
	
	public Player() { 
	}
	
	public Player(String name, int id) {
		this.name = name; // 필드의 name과 변수 name 구분위한 this
		this.id = id;
	}
	
	public Player(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public void printInfo() { // static 빠진이유: 메모리에 바로 올릴 필요 없음
		System.out.println("name: " + name + "| id: " + id + "| email: " + email + "| phone: " + phone);
	}
	
	// 함수 하나 더 만들기

}
