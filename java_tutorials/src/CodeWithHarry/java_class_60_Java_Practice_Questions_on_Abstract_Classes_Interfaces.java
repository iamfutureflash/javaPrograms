package CodeWithHarry;
//Problem 01 starts
abstract class pen{
    abstract void write();
    abstract void refill();
}
//Problem 01 ends
//Problem 02 starts
 class FountainPen{
     void write(){
        System.out.println("writing ...");
    }
    void refill(){
        System.out.println("refilling ...");
    }
    void ChangeNib(){
        System.out.println("changing nib ...");
    }
}
//Problem 02 ends
//Problem 03 starts
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("jumping ...");
    }
    void bite(){
        System.out.println("biteing ...");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("eating food ...");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping ...");
    }
}
//Problem 03 ends
//Problem 04 starts
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
 class SmartTelephone extends Telephone{
    @Override
     void ring(){
        System.out.println("ringing ...");
    }
    @Override
     void lift(){
        System.out.println("picking up ...");
    }
    @Override
     void disconnect(){
        System.out.println("disconnecting the call");
    }
    void mute(){
        System.out.println("call muted");
    }
     void hold(){
         System.out.println("call on hold");
     }
     void addPerson(){
         System.out.println("adding person");
     }
}
//Problem 04 ends
//Problem Q6 and 07 starts
interface TVRemote{
    void volume();
    void number();
}
interface SmartTVRemote extends TVRemote{
    void Pointer();
    void swap();
}
 class Tv implements TVRemote{
     public void volume(){
         System.out.println("increase or decrease volume");
     }
     public void number(){
         System.out.println("enter numbers");
     }
 }
//Problem Q6 and 07 ends
public class java_class_60_Java_Practice_Questions_on_Abstract_Classes_Interfaces {
    public static void main(String[] args) {
        //all questions object solution here
/*
        //Q1 and Q2
        //        FountainPen fp = new FountainPen();
        //        fp.ChangeNib();

        //Q3
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.jump();

//        Q5
        Monkey m = new Human();
        m.bite();
        BasicAnimal ba = new Human();
        ba.eat();
        Human h = new Human();


//        Q4
//        Telephone t = new SmartTelephone();
        */

    }
}
