interface Bicycle{
    int a = 40;
    void applyBrake(int decreement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee po po ,, tujhe dekha toh yeh jana sanam");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }

}

public class cwh_54_Interface {
    public static void main(String[] args) {
AvonCycle a1 = new AvonCycle();
a1.applyBrake(5);
// you can create properties in interface
        System.out.println(a1.a);

    }
}
