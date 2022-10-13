package CodeWithHarry;

import java.util.Scanner;

//Problem 1
class Circle{
    Scanner scan = new Scanner(System.in);
    Double Area, Circumference, radius;
        public Double area_of_circle(Double Radius){
            this.radius = Radius;
            Area =  Math.PI * this.radius * 2;
            return Area;
        }
        public Double Circumference(Double Radius) {
            this.radius = Radius;
            Circumference = 2 * Math.PI * this.radius;
            return Circumference;
        }
}
class Cylinder extends Circle{
    Double Height, Radius, Surface;
    Cylinder(){
        double r,h;
        System.out.print("enter radius:- ");
        r= scan.nextDouble();
        System.out.print("enter height : -");
        h = scan.nextDouble();
        System.out.println("area of circle is:-  " + area_of_circle(r));
        System.out.println("volume of cylinder is : - " + Volume(h,r));
    }
    public Double Volume(Double height, Double radius){
        Height = height;
        this.Radius = radius;
        Surface = area_of_circle(Radius)*Height;
        return Surface;
    }
}
class Rectangle{Scanner scan = new Scanner(System.in);public Double area(Double length, Double width){return length * width;}}
class Cuboid extends Rectangle{
    Cuboid(){
        System.out.print("enter length:- ");
        Double l = scan.nextDouble();
        System.out.print("enter width:- ");
        Double w = scan.nextDouble();
        System.out.print("enter height:- ");
        Double h = scan.nextDouble();
        System.out.println("area of rectangle is :- " + area(l, w));
        System.out.println("surface area of cuboid is :- " + Surface_area(l, w, h));
    }
    public Double Surface_area(Double l, Double w, Double h){
        return area(l, w) * h;
    }
}
public class java_class_52_practice_question_chapter_10 {
    public static void main(String[] args) {
//    Cylinder c1 = new Cylinder();
      Cuboid cuboid = new Cuboid();
    }
}
