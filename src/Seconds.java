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
	
		System.out.print(seconds + "초는 " + days + "일 " + h + "시간 " + m + "분 " + s + "초");
		
	}
	
}
