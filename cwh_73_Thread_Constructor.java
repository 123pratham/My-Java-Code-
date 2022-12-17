class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        System.out.println("Thank you ");
//        while(true){
//            System.out.println("I am a Thread");
//        }
    }
}

public class cwh_73_Thread_Constructor {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Pratham ");
    MyThr t2 = new MyThr("Harsh ");
        t1.start();
        System.out.println("The id of the Thread t is "+t1.getId());
        System.out.println("The name of the Thread t is "+ t1.getName());

    }

}
