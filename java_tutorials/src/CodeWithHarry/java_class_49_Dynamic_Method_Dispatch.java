package CodeWithHarry;
class phone{
    public void music(){
        System.out.println("playing music in phone");
    }
    public void greeting(){
        System.out.println("hello everyone good evening from phone class");
    }
}
class smartphone extends phone{

    @Override
    public void greeting(){
    System.out.println("hello everyone good evening from smartphone class");
    }
    public void music(){
        System.out.println("playing music in smartphone");
    }
}
public class java_class_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//    phone keypad = new phone();
//    smartphone apple = new smartphone();
//    keypad.greeting();
//    apple.greeting();
      phone p1 = new smartphone();
      p1.greeting();
      p1.music();
    }
}
