package CodeWithHarry;
interface camera1{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("greet you");
    }
    default void record4kVideo(){
        greet();
        System.out.println("recording 4k video");
    }
}
interface wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1{
    void callNumber(int PhoneNumber){
        System.out.println("Calling" + PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements wifi1, camera1{
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
public class java_class_59_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        camera1 cam1 = new MySmartPhone1();
        cam1.record4kVideo();
//        cam1.getNetworks();  ----not allowed
        MySmartPhone1 ms = new MySmartPhone1();
        ms.recordVideo();
        ms.getNetworks();
        ms.callNumber(797637732);
        ms.record4kVideo();
    }
}
