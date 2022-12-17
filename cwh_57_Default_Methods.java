interface MyCamera{
    void takeSnap();
    void recordVideo();
   default void record4kVideo(){
        System.out.println("Recording 4k Video....");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void myCellPhoneNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}
class MySmartPhone extends myCellPhone implements MyCamera,MyWifi{
       public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of network");
        String[] networkList = {"Vivek","Pratham","Realme X7MAx","Oppo","Vivo"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting....to......"+network);
    }
}
public class cwh_57_Default_Methods {
    public static void main(String[] args) {
MySmartPhone Vivo = new MySmartPhone();
Vivo.record4kVideo();
String[] ar = Vivo .getNetworks();
        for (String item:ar) {
            System.out.println(item);
        }

    }
}
