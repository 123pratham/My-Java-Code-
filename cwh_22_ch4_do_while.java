

public class cwh_22_ch4_do_while {
    public static void main(String[] args) {
        System.out.println("Demonstrate do while loop in java!");
        // int i = 0;
        // do {
            // if(i%2==0){
            //     System.out.println("even number "+i);
            // }
            // if(i%2!=0){
            //     System.out.println("odd number "+i);
            // }
            int i,m=0,flag=0;
            int n = 3;
            m=n/2;
            if(n==0||n==1){
                System.out.println(n+" it is not prime");
            }else{
                for ( i = 2; i<=m;i++) {
                    if (n%i==0) {
                        System.out.println(n+" it is not prime");
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(n+" it is prime");
                }
            }
        
        //     i++;
        // } while (i<=100);
  }
}
