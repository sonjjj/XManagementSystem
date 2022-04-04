import java.util.Scanner;

public class CarSimulating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car car = new Car(); // Car ������ ȣ��
		
		System.out.println("Car's year model: (e.g. 2015)");
		int num1 = input.nextInt(); // ���ۿ����� �Է� �޾�
		car.getYear(num1); // car Ŭ������ ����
		
		System.out.println("Car's maker: (e.g. 'Honda')");
		String num2 = input.next(); // ����ȸ�縦 �Է� �޾�
		car.getMaker(num2); // car Ŭ������ ����
		
		System.out.println("Car's maximum speed: (e.g. 85.0)");
		double num3 = input.nextDouble(); // �ִ� �ӵ��� �Է� �޾�
		car.getSpeed(num3); // car Ŭ������ ����
		
		System.out.println("���� ���ۿ���: " + car.year); // ���ۿ��� ����
		System.out.println("���� ����ȸ��: " + car.maker); // ����ȸ�� ����
		System.out.println("���� �ִ�ӵ�: " + car.speed); // �ִ� �ӵ� ����
		
		System.out.println("���� �ӵ��� ���ǽ����غ��ô�");
		System.out.println("�󸶷� �޸����?");
		double testspeed = input.nextDouble(); // ����ڰ� ���ϴ� �ڵ��� �ӵ� �Է¹���
		input.close(); //
		
		if (testspeed < car.speed) { // ����ڰ� ���ϴ� �ӵ��� �ִ� �ӵ� �̸��� ��
			System.out.printf("���� �ӵ��� �ü� %f�Դϴ�", testspeed);
		}
		else if (testspeed == car.speed) { // ����ڰ� �ִ� �ӵ��� ���� ��
			System.out.println("�ִ�ӵ� �Դϴ�.");
		}
		else { // ����ڰ� �ִ� �ӵ� �ʰ��� ���� ��
			System.out.println("Impossible!\n�ִ�ӵ��� �����Ƿ� �޸� �� �����ϴ�.");
		}
	}
}