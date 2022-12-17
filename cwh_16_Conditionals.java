import java.util.Scanner;

public class cwh_16_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age>=18){
        //     System.out.println("Yes You can Drive ----");
        // }
        // else{
        //     System.out.println("You cant able to drive a car XXXXX");
        // }

        System.out.println("Enter Marks of Physics: ");
        int ph = sc.nextInt();
        System.out.println("Enter Marks of Maths: ");
        int ma = sc.nextInt();
        System.out.println("Enter marks of Chemistry: ");
        int ch = sc.nextInt();
        System.out.println("Enter Marks of Biology: ");
        int bio = sc.nextInt();
        System.out.println("Enter Marks of English: ");
        int eng = sc.nextInt();
        float percentage  = ((ph+ma+ch+bio+eng)/500.2f*100);
        System.out.println("Your Percentage is : "+ percentage +" %");
        if (percentage >= 85 && percentage <= 100 ) {
            System.out.println("Grade A+");
            String st = "Hello Mr.Pratham \nExcellent.\n\tThanks!";
            System.out.println(st);

        } 
        if(percentage >= 70 && percentage < 85) {
            System.out.println("Grade A ");
        }
        if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade B");
        }
        if(percentage >=40 && percentage < 60){
            System.out.println("Grade C");
        }
    }
}
