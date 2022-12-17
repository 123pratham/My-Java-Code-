
class MyEmployee{
    private int id;
   private String name;
    public void my(){
        System.out.println("My name id is : " +id);
        System.out.println("and my name is : "+name);
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int n){
        id  = n;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
     MyEmployee e1 = new MyEmployee();
//     e1.id = 1001;
//     e1.name = "Santram Yadav";
//        System.out.println(e1.id + " "+e1.name);  // Throws an erro due to private access modifiers..
        e1.setName(" Rishi Soni ");
        e1.setId(10101);
        System.out.println("My name is :"+e1.getName() +"\nMy id is :"+ e1.getId());
    }
}
