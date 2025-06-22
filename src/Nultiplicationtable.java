import java.util.Scanner;
public class Nultiplicationtable
{
    public static void main(String []args)
    {
        Scanner s1 = new Scanner (System.in);
                System.out.println("Multiplication of number \n");
        int u1 = s1.nextInt()  ;
                 System.out.println("number: ");
                 printMultiplicationTable(u1);
    }
    public static void printMultiplicationTable(int u1)
    {
      int  i = 1 ;
        while(i <= 10 ){
            System.out.println(u1 +  " X " + i + " = " + (u1 * i));
            i++; }
    }
}
