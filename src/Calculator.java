import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ���: ");
		int num1 = input.nextInt();
		
		System.out.println();
		
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int num2 = input.nextInt();
		
		System.out.println();
		
		System.out.print("+ - * / �� �ϳ��� �����ڸ� �Է��ϼ���: ");
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
