import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class ceh_20_rockpaperscissor {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissor game! ");
        System.out.println("Rock = 1 , Paper = 2 , Scissor = 3!");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
            switch (game) {
                case 1:
                    if (game > 1) {
                        System.out.println("You lose!");
                    }else if(game < 3){
                        System.out.println("You won!");
                    }else if (game > 2) {
                        System.out.println("You lose!");
                    }
                    break;
            
                default:
                    break;
            }
    }
}
