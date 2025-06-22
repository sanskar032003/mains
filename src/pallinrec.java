import java.util.Scanner;

public class pallinrec {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("wellcome to pallin");
        System.out.println("enter the string ");
        String str = s1.next();
        System.out.println("your number is " + (ispallin(str) ? "pallin" : "not"));


    }
    public static boolean ispallin(String str){
        if (str.length() <= 1 ){
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newstr = str.substring(1 , lastPos);
        return ispallin(newstr);
    }
}
