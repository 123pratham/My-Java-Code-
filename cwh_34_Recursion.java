public class cwh_34_Recursion {
   static int factorial(int n){
       if (n == 0 || n == 1){
           return 1;
       }
       else{
           return n*factorial(n-1);
       }
   }
   static int iterative_factorial(int n){
       int product = 1;
       for(int i=1; i<=n;i++){
           product *= i;
       }
       return product;
   }
static int fabanocci(int n){
       if (n<=1){
           return 1;
       }else {
           return fabanocci(n - 1) + fabanocci(n - 2);
       }
}
    public static void main(String[] args) {
int num = 5;
        System.out.println("The factorial of n is: "+iterative_factorial(num));
        System.out.println(fabanocci(num));

    }
}
