import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		System.out.print("Input the Sentence: ");
		
		String str;		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("" + str);
		sc.close();
	}

}