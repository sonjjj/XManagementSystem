import java.util.Scanner;

public class Car { // ������, �Լ� ������
	
	int year; // year field - ���� ���ۿ���
	String maker; // maker field - ���� ����ȸ��
	double speed; // speed field - ���� �ִ�ӵ�
	
	public Car() { // �⺻ ������
	}
	
	public Car(int year, String maker, double speed) {
		this.year = year;
		this.maker = maker;
		this.speed = speed;
	}
	
	public int getYear(int year) { // ���ۿ����� �����ϴ� �Լ�
		return this.year = year;
	}
	
	public String getMaker(String maker) { // ����ȸ�縦 �����ϴ� �Լ�
		return this.maker = maker;
	}
	
	public double getSpeed(double speed) { // �ִ� �ӵ��� �����ϴ� �Լ�
		return this.speed = speed;
	}
}