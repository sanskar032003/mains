import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter first number :");
        int num1 = s1.nextInt();
        System.out.println("enter second number :");
        int num2 = s1.nextInt();
        System.out.println("enter operator :");
        String operation = s1.next();

        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("Your answer is: " + result);

    }
}
