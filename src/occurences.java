import java.util.Scanner;

public class occurences {
    public static void main (String []args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("find the occurence ");
        int[] numarray = Arrayutility.arrayuse();
        System.out.println("enter number to find the occurence: ");
        int nums = s1.nextInt();
        int occurence = noofoccur(numarray,nums);
        System.out.print("the occurence is: " + occurence );
    }
    public static int noofoccur(int[] numarray,int nums){
        int occur = 0;
        int i = 0;
        while(i < numarray.length){
            if (numarray[i] == nums) {
                occur++;
            }
            i++;
        }

        return occur;
    }
}
