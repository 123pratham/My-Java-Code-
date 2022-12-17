import java.util.Scanner;

public class cwh_25_practise_set4 {
    public static void main(String[] args)
    {
    /////////////////////////////////////////Practise Problem 1 
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //    for(int i = n;i>0;i--){
    //     for(int j = 0;j<i;j++){
    //         System.out.print("P");
    //     }
    //     System.out.print("\n");
    // }
     /////////////////////////////////////////Practise Problem 2 
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum = 0;
    // for(int i = 0;i<n;i++){
    //     sum = sum + (2*i);
    // }
    // System.out.print("Your n even numbers sum is: ");
    // System.out.println(sum);
    ///////////////////////////////////////////// //Practise Problem 3
    // Scanner sc = new Scanner(System.in);
    // int i = 1;
    // int n = sc.nextInt();
    // while (i<=10) {
    //     int mul = i*n;
    //     System.out.println(mul);
    //     i++;
    // }
    //////////////////////////////////////////////////// //Practise Problem 4
    // int i = 10;
    // int n = 5;
    // while (i>=1) {
    //     int mul = i*n;
    //     System.out.println(mul);
    //     --i;
    // }
//////////////////////////////////////////////////////////////// //Practise Problem 5
    // int n = 5;
    // int i = 1;
    // while (i<=10) {
    //   System.out.printf("%d X %d = %d\n ",i,n,i*n);
    //   i++;
    // }
     /////////////////////////////////////////////////Practise Problem 1 
        int fact = 1;
        int j = 1;
        int n = 5;
        while (j<=n) {
          // fact =fact* j;
          fact *= j;
          j++;
        }
        System.out.println(fact);
  }
}
