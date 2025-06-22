import java.util.Scanner;

public class mathpi {
    double radius;

    mathpi(double radius){
      this.radius = radius;
    }

    double circum() {
        return 2 * radius * Math.PI;
    }

    double getarea() {
        return Math.PI * Math.pow(radius , 2);
    }

    @Override
    public String toString() {
        return "mathpi{" +
                "radius=" + radius +
                '}' + getarea() + "circum is " + circum();
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number: ");
        int rad = s1.nextInt ();
        mathpi m1 = new mathpi(rad);
        System.out.println(m1);
    }
}
