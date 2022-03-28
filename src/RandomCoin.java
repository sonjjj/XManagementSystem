import java.util.Scanner;

public class RandomCoin {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random() * 2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("H or T: ");
		
		String mycoin = input.next();
		
		if (mycoin == "H") {
			if (randomNum == 0) {
				System.out.println("Correct !");
			}
			else {
				System.out.println("Incorrect !");
			}
		}
		
		else {
			if (randomNum == 1) {
				System.out.println("Correct !");
			}
			else {
				System.out.println("Incorrect !");
			}
		}
	}
}
