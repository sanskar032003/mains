import java.util.Scanner;
public class reversearr {
    public static void main(String[] args) {
        System.out.println("reversed array \n");
        int[] numarr = Arrayutility.arrayuse();
        rever(numarr);
        System.out.println("your new reversed array is");
        Arrayutility.visiblearray(numarr);

    }
    public static void rever(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1)- i];
            arr[(arr.length - 1)- i] = swap;
            i++;

        }

    }

}
