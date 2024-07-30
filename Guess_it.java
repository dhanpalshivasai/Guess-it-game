
import java.util.Scanner;
import java.util.Random;
public class Guess_it{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int attempts =5;
        int attempts_left=attempts;
        boolean hasWon=false;
        int number_to_guess = random.nextInt(100)+1;
        System.out.println("Welcome to the number guessing game....");
        System.out.println("I have chosen a number between 1-100");
        System.out.println("You have total of "+attempts+" attemps to guess the number.");
        while(attempts_left>0){
            System.out.println("Guess the number :");
            int guess=sc.nextInt();
            if(guess<number_to_guess){
                if(number_to_guess-guess<=10){
                    System.out.println("Very near but low!");
                }else{
                    System.out.println("Too low! ");
                }
                
            }else if(guess>number_to_guess){
                if(guess-number_to_guess<=10){
                    System.out.println("Very near but high!");
                }else{
                    System.out.println("Too high! ");
                }
            }
            else{
                System.out.println("You have guessed the number correctly!");
                hasWon=true;
                break;
            }
            attempts_left--;
            System.out.println("Attempts left "+attempts_left);

        }
        if(hasWon==false){
            System.out.println("Sorry you have run out of attempts!");
            System.out.println("The number was "+number_to_guess);
        }
        sc.close();
        }
}