public class cwh_35_practise_set_on_Methods {
    static void multiplication(int n){
        for (int i = 1; i<=10;i++){
            System.out.format("%d X %d = %d\n", n , i , n*i);
        }
    }
    static void pattern1(int n){
        for (int i = 0;i<n;i++) {
           for (int j = 0;j<i+1;j++){
               System.out.print("*");
           }
            System.out.println( );
        }
    }
    static int sumRec(int n){
        if (n == 1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static void pattern2(int n){
        for (int i = 0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        if (n > 0){
pattern3(n-1);
for (int i=0;i<n;i++){
    System.out.print("*");
}
            System.out.println();
        }
    }

    public static void main(String[] args) {
//Problem number 1
//multiplication(5);
        //Problem number 2
//pattern1(5);
//        int c = sumRec(4);
//        System.out.println(c);
        //Problem 3
//        pattern2(5);
        pattern3(5);
    }
}
