import java.util.Scanner;

public class printodd {
    public static void main(String[] args) {
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("your odd is :" + i);
        }
    }
}
