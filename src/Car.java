import java.util.Scanner;

public class Car { // 생성자, 함수 세가지
	
	int year; // year field - 모델의 제작연도
	String maker; // maker field - 차의 제조회사
	double speed; // speed field - 차의 최대속도
	
	public Car() { // 기본 생성자
	}
	
	public Car(int year, String maker, double speed) {
		this.year = year;
		this.maker = maker;
		this.speed = speed;
	}
	
	public int getYear(int year) { // 제작연도를 리턴하는 함수
		return this.year = year;
	}
	
	public String getMaker(String maker) { // 제조회사를 리턴하는 함수
		return this.maker = maker;
	}
	
	public double getSpeed(double speed) { // 최대 속도를 리턴하는 함수
		return this.speed = speed;
	}
}