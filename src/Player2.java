public class Player2 {
	
	String name;
	int id;
	String email;
	String phone;
	
	static int numStudentsRegistered = 0; // ?
	
	public Player2() { // 새로운 생성자 만들면 기본 생성자 사라짐
		// 
		numStudentsRegistered++; // ?
	}
	
	public Player2(String name, int id) {
		this.name = name; // 필드의 name과 변수 name 구분위한 this
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
	
	public void printInfo() { // static 빠진이유: 메모리에 바로 올릴 필요 없음
		System.out.println("name: " + name);
		System.out.println(" id: " + id);
		System.out.println(" email: " + email);
		System.out.println(" phone: " + phone);
	}
	
	// 함수 하나 더 만들기

}
