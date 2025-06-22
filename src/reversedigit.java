import java.util.Scanner;
public class reversedigit {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("reverse number finding \n");
        int num = s1.nextInt();
        System.out.println("enter ");
        int newnum = reverse(num);
        System.out.println("reverse number is : " + newnum);
    }
    public static int reverse(int num){
        int newnum = 0;
        while (num > 0) {
            int digit = num % 10;
             newnum = newnum * 10 + digit;
             num /= 10;
        }
        return newnum;
    }
}