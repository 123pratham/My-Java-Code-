public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        Circle1 objc = new Circle1(55);
        Cylinder1 c1 = new Cylinder1(55,6);
        c1.volume();
    }
}
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("i am non param circle");
    }
    Circle1(int r){
        System.out.println("iam a circle parameterized constructor ");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r,int h){
    super(r);
    this.height =h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
