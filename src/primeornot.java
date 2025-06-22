import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
        int num = s1.nextInt();
        System.out.println("your number is" + (prime(num) ? "prime" : "notprime"));
    }
        public static boolean prime(int num){
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
    }
}
