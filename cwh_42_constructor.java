class MyMainEmployee{
//    public MyMainEmployee(){ ///constructor
//        id = 101;
//        name = "your name";
//    }
    public MyMainEmployee(String myName , int myId ){
        id = myId;
        name = myName;
    }
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }


}


public class cwh_42_constructor {
    public static void main(String[] args) {
        MyMainEmployee m1 = new MyMainEmployee("sahuji" , 5555555);
//        m1.setName(" Pratham Sahu ");
//        m1.setId(10001);
        System.out.println(m1.getName());
        System.out.println(m1.getId());
    }
}
