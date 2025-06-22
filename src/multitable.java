import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
        int num = s1.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
