import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num = 5, guess;
        do{
            System.out.println("guess the number : ");
            guess = s1.nextInt();
        }
        while (  guess != num );
        System.out.println("correct number : ");
    }
}
