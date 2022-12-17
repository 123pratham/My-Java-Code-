class Employee1{
    int salary;
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
//        System.out.println(" $ Salary is " + salary);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 e1 = new Employee1();//Instantiating a new employee object
        //Setting properties
        e1.id  = 101;
        e1.salary = 10000;
        e1.name = "Pratham Sahu";
        Employee1 deepak = new Employee1();
        deepak.id = 222;
        deepak.salary = 15000;
        deepak.name = "Deepak Soni";
        int salary = deepak.getSalary();
        System.out.println(salary);
        deepak.printDetails();
      //Printing the attributes....
        e1.printDetails();


//        System.out.println(e1.id);
//        System.out.println(e1.name);
    }
}
