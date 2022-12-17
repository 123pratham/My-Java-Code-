
class EkClass{
    int a;
    EkClass(int a){
       this.a = a;
    }

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hoon");
    }
}
public class cwh_47_This_Super {
    public static void main(String[] args) {
EkClass e1 = new EkClass(5);
        System.out.println(e1.getA());
        DoClass d = new DoClass(55);
        
    }
}
