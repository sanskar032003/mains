import java.util.Scanner;

public class guessgame {
    int random;
        guessgame(){
            random = (int) Math.ceil(Math.random() * 100 );
        }
    int g2(int guessmaker){
            return guessmaker - random;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        guessgame g1 = new guessgame();
        int guess;
        int result;
        do{
            System.out.println("guess the number");
            guess = s1.nextInt();
            result = g1.g2(guess);
            if (result == 0) {
                System.out.println("right");
            } else if (result < 0) {
                System.out.println("higher");
            } else {
                System.out.println("lower");
            }
        }   while (result != 0);
            }
        }



