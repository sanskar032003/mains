import java.util.Scanner;

public class studentscore{
        public static void main(String[] args) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("enter number :");
            int min1 = s1.nextInt();
            String result = (min1 > 80) ? "High" : min1 > 20 ? "low" : "Moderate" ;
            System.out.println("your number :" + result);



        }

    }


