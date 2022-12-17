class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
while (i<40000){
    System.out.println("My thread is cooking ");
    System.out.println("I am happy");
    i++;
}
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<40000){
            System.out.println("Thread 2 is chatting with her gf ");
            System.out.println("I am sad");
            i++;
        }
    }
}


public class cwh_70 {
    public static void main(String[] args) {
MyThread1 t1 = new MyThread1();
Mythread2 t2 = new Mythread2();
t1.start();
t2.start();
    }
}
