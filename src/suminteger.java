import java.util.Scanner;
public class suminteger {
    public static void main(String []args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("sum of interger \n");
        int num = s1.nextInt();
        System.out.println("enter ");
        int sum = sumofinterger(num);
        System.out.println("sum is : " + sum);
    }
    public static int sumofinterger(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
                return sum;
    }
}
