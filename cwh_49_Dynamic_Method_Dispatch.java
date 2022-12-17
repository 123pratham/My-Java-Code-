class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class SmaertPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}
public class cwh_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//Phone on = new Phone();
//SmaertPhone s1= new SmaertPhone();
//s1.name();
//        on.greet();
//        on.name();
        Phone p1 = new SmaertPhone();
        p1.name();

    }
}

