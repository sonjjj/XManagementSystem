import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요: ");
		int num1 = input.nextInt();
		
		System.out.println();
		
		System.out.print("두 번째 수를 입력하세요: ");
		int num2 = input.nextInt();
		
		System.out.println();
		
		System.out.print("+ - * / 중 하나의 연산자를 입력하세요: ");
		String operation = input.next();
		
		System.out.println();
		
		input.close();
		
		switch(operation) {
		case "+" :
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-" :
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*" :
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/" :
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		}

	}

}
