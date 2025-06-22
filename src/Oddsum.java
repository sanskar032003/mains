import java.util.Scanner;
public class Oddsum {
    public static void main (String []args)
    {
        Scanner s1 = new Scanner (System.in);
        System.out.println("Oddsum \n");
        int num = s1.nextInt();
        System.out.println("Enter number");
        int sum = sumofodd(num);
        System.out.println("Sum of odd numbers up to " + num + " is: " + sum);
    }
    public static int sumofodd(int num)
    {
       int sum = 0;
        int i = 1;
        while( i <= num ) {
            sum += i;
            i += 2;

        }

        return sum;
    }
}
