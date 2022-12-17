class MyThr1 extends Thread{
    public MyThr1 (String name){
        super(name);
    }
    public void run(){
int i = 35;
while(true){
    System.out.println("Thank you: " + this.getName());
}

    }
}

public class cwh_74_Thread_Priority {
    public static void main(String[] args) {
MyThr1 t1 = new MyThr1("Pratham 1");
MyThr1 t2 = new MyThr1("Pratham 2");
MyThr1 t3 = new MyThr1("Pratham 3");
MyThr1 t4 = new MyThr1("Pratham 4");
MyThr1 t5 = new MyThr1("Pratham 5 (Most important)");
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
t5.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.MIN_PRIORITY);
t4.setPriority(Thread.MIN_PRIORITY);

    }
}
