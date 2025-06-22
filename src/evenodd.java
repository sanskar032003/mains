import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number :");
        int min1 = s1.nextInt();
        String result = min1 % 2 == 0 ? "EVEN" : "ODD";
        System.out.println("your number :" + result);



    }

}
