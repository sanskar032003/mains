import java.util.Scanner;

public class exitenter {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        while(true){
            System.out.println("enter command");
            String operation = s1.next();
            if(operation.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("exited");
    }

}
