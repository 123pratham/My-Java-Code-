public class cwh_31_Methods {

    // static int  logic(int x , int y){
    //     int z;
    //     if(x>y){
    //         z = x + y;
    //     }else{
    //         z = (x+y)*5;
    //     }
    //     return z;
    // }
    // static int mySum( int x , int y ){
        int mySum( int x , int y ){
        int z ;
        z = x + y;
        return z;
    }
    public static void main(String[] args) {
        cwh_31_Methods obj = new cwh_31_Methods();
        int a =5;
        int b = 8;
        int c ;
        // c = logic(a , b);   // Using with function.
        c = obj.mySum(a, b);

        int a1 = 15;
        int b1 = 10;
        int c1;
        c1 = obj.mySum(a1, b1);
        // c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
