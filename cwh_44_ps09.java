import org.w3c.dom.css.CSSUnknownRule;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI* radius * radius + 2 * Math.PI* radius * height;
    }
    public double volume(){
        return  Math.PI * radius * radius * height;
    }
}

class rectangle{
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class cwh_44_ps09 {
    public static void main(String[] args) {

        // Probkem 1
//Cylinder myCylinder = new Cylinder(9,12);
//// myCylinder.setRadius(9);
//        System.out.println("Radius of the cylinder is: "+myCylinder.getRadius());
//// myCylinder.setHeight(12);
// //         Problem 2
//        System.out.println("Height of the cylinder is: "+myCylinder.getHeight());
//        System.out.println("The surface area of the cylinder is "+myCylinder.surfaceArea());
//        System.out.println("The volume of the cylinder is: "+ myCylinder.volume());

//          Problem 3
        rectangle r = new rectangle(12,56);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());




    }
}
