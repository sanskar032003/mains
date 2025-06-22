import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Oddsum \n");
        System.out.println("Enter number");
        int num = s1.nextInt();

        long fact = factorial(num);
        System.out.println("factorial is  " + fact);

}
    public static long factorial(int num)
    {
     if (num < 2){
         return 1;
     }
     long fact = 1;
     int i = 1;
     while (i <= num) {
         fact *= i;
         i++;

     }
        return fact;
     }

}