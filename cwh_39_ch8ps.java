
class Employee{
    int salary;
    String name;


public int getSalary(){
    return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name = n;
}
}


class cellPhone{
    public void ring(){
        System.out.println(" Ringing.... ");
    }
    public void vibrate() {
        System.out.println(" Vibrating.... ");
    }
    public void callFriend() {
        System.out.println(" calling rishi.... ");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return  4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println(" hitting the enemy!");
    }
    public void run(){
        System.out.println(" running from the enemy!");
    }
    public void fire(){
        System.out.println(" Firing on the enemy!");
    }
}

class Circle {
int radius;
public double area(int r){
    return r*r*3.14;
    }
public double Circumference(){
    return 2*3.14*radius;
}
}
class Rectangle{
    int length;
    int breadth;
    public int perimeter(){
        return 2*length*breadth;
    }
    public int area(){
        return breadth*length;
    }
}


    public class cwh_39_ch8ps {
    public static void main(String[] args) {
       /* // Problem 1
        Employee e1  = new Employee();
        e1.salary = 12000;
        System.out.println("My Salary is : "+e1.getSalary());
        e1.setName("Pratham Sahu");
        System.out.println(e1.getName());

        // Problem 2
        cellPhone asus = new cellPhone();
        asus.ring();
        asus.vibrate();
        asus.callFriend();*/
        // Problem 3
       /* Square sq = new Square();
        sq.side = 3;
        sq.area();
        sq.parameter();
        System.out.println(sq.area()+"  "+sq.parameter());*/
// Problem 4
        // Tommy player1 = new Tommy();
        // player1.fire();
        // player1.hit();
        // player1.run();

//   Problem 5
        Circle c1 = new Circle();
    c1.radius = 5;
    System.out.println("The circumference of circle is : "+ c1.Circumference());
     System.out.println("The area of circle is : " +c1.area(5));
//  Priblem 6
Rectangle r = new Rectangle();
r.breadth = 3;
r.length = 3;
r.perimeter();
System.out.println("The perimeter of rectangle is : " + r.perimeter());
r.area();
System.out.println("the area of rectangle is : "+r.area());


    }
}
