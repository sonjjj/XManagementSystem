import java.util.Scanner;

public class CarSimulating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car car = new Car(); // Car 생성자 호출
		
		System.out.println("Car's year model: (e.g. 2015)");
		int num1 = input.nextInt(); // 제작연도를 입력 받아
		car.getYear(num1); // car 클래스에 저장
		
		System.out.println("Car's maker: (e.g. 'Honda')");
		String num2 = input.next(); // 제조회사를 입력 받아
		car.getMaker(num2); // car 클래스에 저장
		
		System.out.println("Car's maximum speed: (e.g. 85.0)");
		double num3 = input.nextDouble(); // 최대 속도를 입력 받아
		car.getSpeed(num3); // car 클래스에 저장
		
		System.out.println("차의 제작연도: " + car.year); // 제작연도 리턴
		System.out.println("차의 제조회사: " + car.maker); // 제조회사 리턴
		System.out.println("차의 최대속도: " + car.speed); // 최대 속도 리턴
		
		System.out.println("차의 속도를 모의실험해봅시다");
		System.out.println("얼마로 달릴까요?");
		double testspeed = input.nextDouble(); // 사용자가 원하는 자동차 속도 입력받음
		input.close(); //
		
		if (testspeed < car.speed) { // 사용자가 원하는 속도가 최대 속도 미만일 때
			System.out.printf("현재 속도는 시속 %f입니다", testspeed);
		}
		else if (testspeed == car.speed) { // 사용자가 최대 속도를 원할 때
			System.out.println("최대속도 입니다.");
		}
		else { // 사용자가 최대 속도 초과를 원할 때
			System.out.println("Impossible!\n최대속도를 넘으므로 달릴 수 없습니다.");
		}
	}
}