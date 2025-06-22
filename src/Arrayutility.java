import java.util.Scanner;
public class Arrayutility {
    public static int[] arrayuse() {
        Scanner s1 = new Scanner (System.in);
        System.out.print("please enter the element: ");
        int size =s1.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("please enter the number " + (i + 1) + " : ");
            nums[i] = s1.nextInt();
            i++;
        }
        return nums;
    }
    public static void visiblearray(int[] numarray){
        int i = 0;
        while(i < numarray.length){
            System.out.print(numarray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
