import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("fibonacci number finding \n");
        System.out.println("enter ");
        int num = s1.nextInt();
        System.out.println("fibonacci number is : " );
        fibo(num);
    }
    public static void fibo(int num){
    if (num < 0) return;
    System.out.println("0 ");
    if (num == 0) return;
    System.out.println("1 ");
    int first = 0, second = 1;
        while(first + second <= num){
        int third = first + second;
        System.out.println( third + " ");
        first = second;
        second = third;
    }
    }
}