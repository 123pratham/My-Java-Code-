import java.util.Scanner;

public class cwh_31_1_Methodsfunction {

    static int add(int x,int y){
        int sum;
        sum = x + y;
        return sum;
    }
    static int sub(int x , int y){
        int minus;
        minus = x - y;
        return minus;
    }
    static int multi(int x, int y){
        int mul;
        mul = x * y;
        return mul;
    }
    static float div(float x, float y){
        float division;
        division = x / y;
        return division;
    }
    static float mod(float x, float y){
        float modulus;
        modulus =  x % y;
        return modulus;
    }
    

    public static void main(String[] args) {
     Scanner fun  = new Scanner(System.in);
     int num1 = fun.nextInt();
     int num2  = fun.nextInt();
     int total  = add( num1, num2);
     int total1 = sub(num1, num2);
     int total2 = multi(num1, num2);
     float total3 = div(num1, num2);
     float total4 = mod(num1,num2);
     System.out.println(total);
     System.out.println(total1);
     System.out.println(total2);
     System.out.println(total3);
     System.out.println(total4);

    }
}
