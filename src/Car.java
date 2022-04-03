import java.util.Scanner;

public class Car { // 생성자, 함수 세가지
	
	int year; // year field - 모델의 제작연도
	String maker; // maker field - 차의 제조회사
	double speed; // speed field - 차의 최대속도
	
	public Car() {
		
	}
	
	public Car(int year, String maker, double speed) {
		this.year = year;
		this.maker = maker;
		this.speed = speed;
	}
	
	public int getYear(int year) {
		return this.year = year;
	}
	
	public String getMaker(String maker) {
		return this.maker = maker;
	}
	
	public double getSpeed(double speed) {
		return this.speed = speed;
	}
}

class CarSimulating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car car = new Car();
		
		System.out.println("Car's year model: (e.g. 2015)");
		int num1 = input.nextInt();
		car.getYear(num1);
		
		System.out.println("Car's maker: (e.g. 'Honda')");
		String num2 = input.next();
		car.getMaker(num2);
		
		System.out.println("Car's maximum speed: (e.g. 85.0)");
		double num3 = input.nextDouble();
		car.getSpeed(num3);
		
		System.out.println("차의 제작연도: " + car.year);
		System.out.println("차의 제조회사: " + car.maker);
		System.out.println("차의 최대속도: " + car.speed);
		
		System.out.println("차의 속도를 모의실험해봅시다");
		System.out.println("얼마로 달릴까요?");
		double testspeed = input.nextDouble();
		input.close();
		
		if (testspeed < car.speed) {
			System.out.printf("현재 속도는 시속 %f입니다", testspeed);
		}
		else if (testspeed == car.speed) {
			System.out.println("최대속도 입니다.");
		}
		else {
			System.out.println("최대속도를 넘으므로 달릴 수 없습니다.");
		}
	}
}