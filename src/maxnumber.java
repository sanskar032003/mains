import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int[] arr = Arrayutility.arrayuse();

        int max = Integer.MIN_VALUE;
        for( int num : arr){
            if (max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
