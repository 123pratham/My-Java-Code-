import java.util.Random;
import java.util.Scanner;

/* Create a class Game, Which allows a user to play "Guess the number "
       game once. Game should have the following methods:
       1. Constructor to generate the random number.
       2. Take a userInput to make a user input of number.
       3. isCorrectNumber() to detect whether the number entered by the user true.
       use properties such as number of guese(int) etc to get this task done.
       */
class Game{
    private int userInput;
    private int computerInput;
    public int getUserinput(){
        return userInput;
    }
    public void setUserinput(int input){
        userInput=input;
    }
    public int getComputerinput(){
        return computerInput;
    }
    public void setComputerinput(int input1){
        computerInput=input1;
    }

}

public class cwh_43_Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        Game g1 = new Game();
        g1.setComputerinput(random.nextInt(100));
        System.out.println(g1.getComputerinput());



    }
}
