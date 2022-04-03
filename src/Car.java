import java.util.Scanner;

public class Car { // ������, �Լ� ������
	
	int year; // year field - ���� ���ۿ���
	String maker; // maker field - ���� ����ȸ��
	double speed; // speed field - ���� �ִ�ӵ�
	
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
		
		System.out.println("���� ���ۿ���: " + car.year);
		System.out.println("���� ����ȸ��: " + car.maker);
		System.out.println("���� �ִ�ӵ�: " + car.speed);
		
		System.out.println("���� �ӵ��� ���ǽ����غ��ô�");
		System.out.println("�󸶷� �޸����?");
		double testspeed = input.nextDouble();
		input.close();
		
		if (testspeed < car.speed) {
			System.out.printf("���� �ӵ��� �ü� %f�Դϴ�", testspeed);
		}
		else if (testspeed == car.speed) {
			System.out.println("�ִ�ӵ� �Դϴ�.");
		}
		else {
			System.out.println("�ִ�ӵ��� �����Ƿ� �޸� �� �����ϴ�.");
		}
	}
}