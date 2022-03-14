import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		System.out.print("Input the Sentence: ");
			
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		sc.close();
	}

}