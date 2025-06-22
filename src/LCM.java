import java.util.Scanner;
public class LCM {
    public static void main(String []args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("sum of interger \n");
        int f1 = s1.nextInt();
        System.out.println("first ");
        int f2 = s1.nextInt();
        System.out.println("second ");
        int lcm = findlcm(f1, f2);
        System.out.println("lcm is : " + lcm);
    }
    public static int findlcm(int f1, int f2){
        int i = 1;
        while (i <= f1) {
            int factor = i * f1;
            if (factor % f2 == 0) {
                return factor ;
            }
            i++;
        }

    return 0;
    }
}