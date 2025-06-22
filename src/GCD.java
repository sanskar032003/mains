import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("finding gcd \n");
        int f1 = s1.nextInt();
        System.out.println("first ");
        int f2 = s1.nextInt();
        System.out.println("second ");
        int gcd = findgcd(f1 ,f2);
        System.out.println("gcd is : " + gcd);
    }
    public static int findgcd(int f1 , int f2){
        int gcd = 1;
        int i = 2;
        int least= least(f1,f2);
        while(i <= least){
            if (f1 % i == 0 && f2 % i == 0){
                gcd = i;

            }
            i++;

        }
        return gcd;

    }
    public static int least(int f1, int f2){
        return Math.min(f1, f2);
        }

}