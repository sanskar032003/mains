import java.util.Scanner;

public class recursives {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = s1.nextInt();
        long result = factorial2(num);
        System.out.println("your number is " + result);
    }

    public static long factorial2(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial2(num - 1);
    }
}
//    public static long factorial(int num){
//        long result =  1;
//        for(int i = 1 ; i <= num ; i++){
//            result *= i;
//
//        }
//        return result;
//    }

