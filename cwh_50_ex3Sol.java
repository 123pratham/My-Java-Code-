import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game1(){
        Random rand = new Random();
        this.number = rand.nextInt(100) ;
    }
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\n you guessed it in %d attempts ", number,noOfGuesses);
            return true;
        } else if (inputNumber<number) {
            System.out.println(" Too low....");
        }else if (inputNumber>number) {
            System.out.println(" Too high....");
        }
        return false;

    }
}

public class cwh_50_ex3Sol {
    public static void main(String[] args) {
/*    Create a class game, which allow a user to play "Guess the numbe"
    game once. Game should have following methods:
    1. Constructor() to generate the random number.
    2. takeUSerIinput() to take a user input of number.
    3. isCorrect number() to detect the whether the number entered by the user is true.
    4. Getters and setter for noofGueses
            use properties for noOfGuesses(int )etc to get this task done!
 */
        Game1 g = new Game1();
        boolean b = false;
        while (!b) {

            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
