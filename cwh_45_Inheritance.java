
class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base and setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;
    public int getY(int y){
        return y;
    }
    public void setY(){
        this.y=y;
    }
}
public class cwh_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(88);
        System.out.println("Base output is: "+b.getX());
Derived d = new Derived();
d.setX(45);
        System.out.println("Derived class output is: "+d.getX());
    }
}
