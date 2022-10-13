package CodeWithHarry;
interface camera{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("greet you");
    }
    default void record4kVideo(){
        System.out.println("recording 4k video");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling" + PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements wifi, camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }

    public String[] getNetworks() {
        System.out.println("geting connection");
        String[] names = {"harry", "puneet", "heroman"};
        return names;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to the network" + network);
    }
}
public class java_class_57_Java_Interfaces_Example_Default_Methods {
    public static void main(String[] args) {
    MySmartPhone ms = new MySmartPhone();
    String[] array = ms.getNetworks();
        for (String item:array){
            System.out.println(item);
        }
        ms.record4kVideo();
    }
}
