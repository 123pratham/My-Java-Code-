public class cwh_32_Method_OverLoading {
    static void foo(){
        System.out.println(" Good Morning " +" Bro!");

    }

    static void foo(String a){
        System.out.println(" Good Night "+ a + " Bro!");
    }

    static void foo(int a){
        System.out.println(" Good Evening " + a + " Bro!");
    }

    static void  foo(float a){
        System.out.println("Good After noon " + a + " Bro!");
    }
    static void foo(int a , int b){
        System.out.println(" hello bro "+ a);
        System.out.println(" or dada ka kh rye "+b);
    }

    static void change2(int arr[]){
        arr[0] = 98;
    }

    static void change(int a){
         a = 98;
    }
    static void telljokes(){
        System.out.println("("+"I invented a new word!\n " + "Plagiarism!"+")");
    }
    public static void main(String[] args) {
       // telljokes();
      
      //  int x = 45;
      //  change(x);
      //  int [] marks = {55,66,25,99,88,75};
      //  change2(marks);
      //  System.out.println("The Value of marks[0] after running change function "+marks[0]);

      // Method OverLoading
      foo();
      foo("Pratham");
      foo(2000);
      //foo(2.0);
      foo(200,500);
    }
}
