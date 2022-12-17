import java.util.Random;
import java.util.Scanner;

public class cwh_41_Ex2 {
    public static void main(String[] args) {
        // 0 for rock , 1 for paper , 2 for scissor
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter --> [0 for Rock]<>[1 for Paper]<>[2 for scissor]");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput){
            System.out.println("Draw!");
        }else if (userInput == 0 && computerInput == 2 ||userInput == 1 && computerInput == 0
                || userInput == 2 || computerInput == 1){
            System.out.println("Congratulations! \n You won the match ");
        }
        else {
            System.out.println("Computer won the match! Try again");
        }
        System.out.println("Computer choice is "+ computerInput);
        if (computerInput == 0){
            System.out.println("Computer choice is rock ");
        }else if(computerInput == 1){
            System.out.println("Computer choice is Paper ");
        } else if (computerInput == 2) {
            System.out.println("Computer choice is Scissor ");
        }
    }
}
