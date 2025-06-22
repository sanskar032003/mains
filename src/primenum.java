import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("prime number finding \n");
        int num = s1.nextInt();
        System.out.println("enter ");
        boolean pri = prime(num);
        System.out.println("prime number is : " + pri);
    }
    public static boolean prime(int num){
        int i=2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}