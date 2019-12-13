import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1.ADD");
		System.out.println("2.SUBTRACT");
		System.out.println("3.MULTIPLY");
		System.out.println("4.DIVIDE");
		System.out.println();
		System.out.println("Type the number of the command you want to use.");
		
		String answer = scan.nextLine();
	
		if(answer.equals("1")){
			System.out.println("Input the numbers.");
			int num1 = scan.nextInt();
			System.out.println("Now the next number.");
			int num2 = scan.nextInt();
			
			System.out.println(calc.addNum(num1, num2));
			System.exit(0);
		}else if(answer.equals("2")) {
			System.out.println("Input the numbers.");
			int num1 = scan.nextInt();
			System.out.println("Now the next number.");
			int num2 = scan.nextInt();
			
			System.out.println(calc.subNum(num1, num2));
			System.exit(0);
		}else if(answer.equals("3")) {
			System.out.println("Input the numbers.");
			int num1 = scan.nextInt();
			System.out.println("Now the next number.");
			int num2 = scan.nextInt();
			
			System.out.println(calc.multNum(num1, num2));
			System.exit(0);
		}else if(answer.equals("4")) {
			System.out.println("Input the numbers.");
			int num1 = scan.nextInt();
			System.out.println("Now the next number.");
			int num2 = scan.nextInt();
			
			System.out.println(calc.divideNum(num1, num2));
			System.exit(0);
		}else {
			System.out.println("Invalid input, exiting program.");
			System.exit(0);
		}

	}
}