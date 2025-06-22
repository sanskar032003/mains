import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter month :");
        int monthnum = s1.nextInt();
        monthd(monthnum);
    }
    public static void monthd(int monthnum) {
        switch (monthnum) {
        case 1 -> System.out.println("Month: Jan");
        default -> System.out.println("Month: invalid");
        };
    }
}
