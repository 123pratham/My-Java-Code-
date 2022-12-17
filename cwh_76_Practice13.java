class Practice13 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}


public class cwh_76_Practice13 {
    public static void main(String[] args) {
Practice13 p = new Practice13();
Practice13b p1 = new Practice13b();
p.start();
p1.start();
//p.setPriority(Thread.MAX_PRIORITY);
        p.setPriority(Thread.MIN_PRIORITY);
    }
}
