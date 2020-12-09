package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();


        System.out.println("Enter number to choose operation 1 -, 2 +, 3 /, 4 *");
        int operation = scanner.nextInt();


        switch (operation) {
            case 1:
                System.out.println(calculator.add(a, b));
                break;
            case 2:
                System.out.println(calculator.sub(a, b));
                break;
            case 3:
                try {
                    System.out.println(calculator.div(a, b));
                } catch (MyException myException){
                    System.out.println(myException.getMessage());
                }

                break;
            case 4:
                System.out.println(calculator.mul(a, b));
                break;
            default:
                System.out.println("cant find operation number");
        }
    }
}
//enter first number
//10
//enter second number
//0
//Enter number to choose operation 1 -, 2 +, 3 /, 4 *
//3
/// by zero
//-1
//My exception