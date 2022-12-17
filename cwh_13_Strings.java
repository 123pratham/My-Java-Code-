import java.util.Scanner;

public class cwh_13_Strings {
    public static void main(String[] args) {
        //String name = new String("Pratham");
        // String name = "Pratham";
        // System.out.print("The name is ");
        // System.out.println(name);

        // int a = 56;
        // float b = 55.5645f;
        // System.out.printf("The value of a is %d and b is %f", a, b);


         Scanner st = new Scanner(System.in);
        // System.out.println("Please Enter Your Name :");
        // String name = st.next();
        // System.out.println("Hello "+ name + " Welcome to Lenovo Ideapad 3");
        String name = st.next(); //Only print 1st word of line
        String name1 = st.nextLine();
        System.out.println(name1);
        
    }
}
