import java.util.Scanner;

public class deletearray {
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Delete array \n");
        int[] numarray = Arrayutility.arrayuse();
        System.out.println("enter delete number ");
        int numtodelete = s1.nextInt();
        int[] newarray = deletenum(numarray , numtodelete);
        System.out.println("new array : ");
        Arrayutility.visiblearray(newarray);

    }
    public static int[] deletenum(int[] numarray,int numdelete){
        int occ = occurences.noofoccur(numarray, numdelete);
        if(occ == 0){
            return numarray;
        }
        int newsize = numarray.length - occ;
        int []newarr = new int[newsize];

        int i = 0,j = 0;
        while(i < numarray.length){
            if (numarray[i] != numdelete){
                newarr[j] = numarray[i];
              j++;
            }
            i++;
        }
        return newarr;


    }
}
