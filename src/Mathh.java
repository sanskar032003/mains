import java.util.Scanner;

public class Mathh {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println(Math.abs(108));
        System.out.println(Math.ceil(108.7));

        for (int i = 0; i < 10 ; i++) {
            int random = (int) Math.round(Math.random() * 1000);
            System.out.println(random);

        }


    }

}
