import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.print("Enter Fahrenheit temp: ");
		
		Scanner sc = new Scanner(System.in);
		
		Double F = sc.nextDouble();
		Double C = (F-32)*5/9;
		
		System.out.println("Converted celsius temp: " + C);
		
		sc.close();

	}

}