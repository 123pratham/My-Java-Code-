import java.util.Scanner;

public class cwh_11_cbse_cal {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("Enter marks of Physics : ");
        int physics = cal.nextInt();
        System.out.println("Enter marks of Maths : ");
        int maths = cal.nextInt();
        System.out.println("Enter marks of Chemistry : ");
        int chemistry = cal.nextInt();
        System.out.println("Enter marks of Computer : ");
        int computer = cal.nextInt();
        System.out.println("Enter marks of English : ");
        int english = cal.nextInt();
        float percentage = ((physics + maths + chemistry + computer + english)/500.0f*100);
        System.out.println("Your average percentage is : " + percentage+" %");
    }
}
