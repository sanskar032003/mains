import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int age;
        do {
            System.out.println("enter age: ");
            age = s1.nextInt();
        }
        while(age < 0 || age > 100);
        System.out.println("your age: " + age);
        }
    }
