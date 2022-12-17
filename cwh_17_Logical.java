public class cwh_17_Logical {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        if (a && b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        boolean c = true;
        boolean d = false;
        if (c || d){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        boolean e = true;
        boolean f = true;
        if (e == f){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        boolean g = true;
        boolean h = false;
        if (g != h){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

    }
}