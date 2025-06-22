import java.util.Scanner;

public class sumposi {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("sum  of positive");
        int[] arr = Arrayutility.arrayuse();

        int sum = 0;
        for(int nums : arr){
            if(nums < 0){
                continue;
            }
            sum += nums;
        }
        System.out.println("sum is " + sum);
    }
}
