class Base1{
   public int x;
   Base1()
   {
       System.out.println("iam a constructor ");
   }
   Base1(int x){
       System.out.println("I am an overloaded constructor with value of x as: "+ x);
   }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("i am a derived classs constrcutor");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("I am a overloaded constructor with derived class of y as: "+y);
    }
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y=y;
    }
}
class childofDerived1 extends Derived1{
    childofDerived1(){
        System.out.println("i am a child of derived constructor");
    }
    childofDerived1(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of derived with value of z as: "+z);
    }
}

public class cwh_46_Constructor_in_Inheritance {
    public static void main(String[] args) {
//Base1 b = new Base1();
//Derived1 d = new Derived1();
//Derived1 d = new Derived1(4,6);
        childofDerived1 d = new childofDerived1(4,5,5);


    }
}
