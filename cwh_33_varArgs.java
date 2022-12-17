public class cwh_33_varArgs {
    static int sum(int a, int b){
        return a+b;
    } static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    static int sum(int ...arr){
        int  result = 0;
        for(int a : arr){
           result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorials");
        System.out.println("The sum of 34 and 4 is: " + sum(34,4));
        System.out.println("the sum of 5, 5 and 5 is: "+ sum(5,5,5));
        System.out.println("The sum of 5, 5, 5 and 5 is: "+sum(5,5,5,5));
        System.out.println("the sum of using varargs (4,5,5,5,5,4,2) is: "+ sum(4,5,5,5,5,4,2));
    }
}
