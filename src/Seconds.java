import java.util.Scanner;

public class Seconds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds: (100000)");
		
		int seconds = input.nextInt();
		
		int minutes = seconds/60;
		int hours = minutes/60;
		int days = hours/24;
		
		int s = seconds % 60;
		int m = minutes % 60;
		int h = hours % 24;
		
		input.close();
	
		System.out.println(seconds + "�ʴ� " + days + "�� " + h + "�ð� " + m + "�� " + s + "��");
		
		if (days > 365) {
			System.out.println(seconds + "�ʴ� 1���� �ѽ��ϴ�.");
		}
		else {
			System.out.println(seconds + "�ʴ� 1���� ���� �ʽ��ϴ�.");
		}
	}
	
}
