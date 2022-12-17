interface SampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class Myclass implements childSampleInterface{
    public void meth1(){
        System.out.println("This is meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("This is meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("This is meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("This is meth 4");
    }
}




public class cwh_Interface_Inheritance {
    public static void main(String[] args) {
     Myclass m1 = new Myclass();
     m1.meth1();
     m1.meth2();
     m1.meth3();
     m1.meth4();
    }
}
