import java.util.Scanner;

public class minoftwo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number 1 :");
        int min1 = s1.nextInt();
        System.out.println("enter number 2 :");
        int min2 = s1.nextInt();
        System.out.println("min number :" + min1);
        System.out.println("max number :" + min2);
    }
    public int min(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

}
