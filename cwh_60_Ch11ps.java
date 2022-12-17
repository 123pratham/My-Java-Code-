abstract class Pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refill");
    }
    void changingNib(){
        System.out.println("Changing nib");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping......");
    }
    public void bite(){
        System.out.println("Monkey is bitting...... ");
    }
}
interface BasicAnimal{
void sleep();
void eat();
}

class Human extends Monkey implements BasicAnimal{
void speak(){
    System.out.println("Helo Sir.....");
}

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping....");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating......");
    }
}

public class cwh_60_Ch11ps {
    public static void main(String[] args) {
//FountainPen p1 = new FountainPen();
//p1.changingNib();
//p1.refill();
//p1.write();
        Human h1 = new Human();
        h1.eat();
        h1.speak();
        h1.jump();
        h1.sleep();
        h1.bite();



    }
}
