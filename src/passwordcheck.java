import java.util.Scanner;

public class passwordcheck {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("wellcome to password");
        String password;
        do{
            System.out.println("enter password");
            password = s1.next();
        }
        while(!isvalid(password));
        System.out.println("Thanks for entering a valid password");
    }
    public static boolean isvalid(String password){
        return password.equals("honey");
    }
}
