import java.util.Scanner;

public class cwh_18_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to show week days:");
        // int week_days = sc.nextInt();
        // switch (week_days) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        //         default:
        //         System.out.println("error 404----->try again0x00");
        //         break;


        
        // System.out.println("Show months name by its number choose between 1 to 12:");
        // int months_name = sc.nextInt();
        // switch (months_name) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        // case 2:
        // System.out.println("February");
        // break;
        // case 3:
        // System.out.println("March its my birthday month");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // case 5:
        // System.out.println("May");
        // break;
        // case 6:
        // System.out.println("June");
        // break;
        // case 7:
        // System.out.println("July");
        // break;
        // case 8:
        // System.out.println("August");
        // break;
        // case 9:
        // System.out.println("September");
        // break;
        // case 10:
        // System.out.println("October");
        // break;
        // case 11:
        // System.out.println("November");
        // break;
        // case 12:
        // System.out.println("December");
        // break;
        //     default:
        //     System.out.println("it is wrong number choose try again error 404");
        //         break;
        // }
System.out.println("Choose arithmetic button");
System.out.println("<----------------  * - / + %  ------------->");
        String var = sc.nextLine();
        switch (var) {
            case "+":
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                System.out.println("Your sum is: " + sum);

                break;
        case "/":
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        float div = num3  / num4;
        System.out.println("Your division is: "+ div);
        break;
        case "*":
        float num5 = sc.nextFloat();
        float num6 = sc.nextFloat();
        float mul = num5 * num6;
        System.out.println("Your multiplication is: "+mul);
        break;
        case "-":
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int sub = num7 - num8;
        System.out.println("Your subtraction is: "+sub);
        break;
        case "%":
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();
        int mod = num9 - num10;
        System.out.println("Your moduler(remainder) is: "+mod);
        break;
            default:
            System.out.println("Error 404");
                break;
        }


        }
}
