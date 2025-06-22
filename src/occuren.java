import java.util.Scanner;

public class occuren {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("wellcom to occur");
        int[] arr = Arrayutility.arrayuse();
        System.out.println("enter the number you want to search");
        int element = s1.nextInt();
        int occ = occur(arr, element);
        System.out.println("Your element was found: " + occ + " times.");
    }
        public static int occur(int[] arr ,int element){

        int occur = 0;
        for(int nums: arr){
            if (nums == element){
                occur++;
            }
        }
        return occur;


    }
}
