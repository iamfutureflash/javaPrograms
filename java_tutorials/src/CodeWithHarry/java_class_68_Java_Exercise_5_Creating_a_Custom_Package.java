package CodeWithHarry;

/*   *** WRITE THIS CODE IN NOTEPAD ***
    You have to createapackage named com.codewithharry.shape---------------------------------done
    This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere--done
    These classes should use inheritance to properly manage the code!------------------------
    Include methods like volume,surface area and getters/setters for dimensions--------------
*/
class rectangle68{
    public double surface_of_rec(double length, double width){
        return length*width;
    }
}
class Square{
    public double surface_of_square(double side){
        return Math.pow(side,2);
    }
    public double volume_of_square(double side){
        return Math.pow(side,3);
    }
}
class circle68{
    public double surface_of_circle(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
class cylinder68{
    public double surface_of_Cylinder(double radius, double height){
//        A=2πrh+2πr2
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume_of_Cylinder(double radius, double height){
            return Math.PI*Math.pow(radius,2)*height;
    }
}
class Sphere68{
    public double surface_of_sphere(double radius){
        return 4*Math.PI*Math.pow(radius,2);
    }
    public double volume_of_sphere(double radius){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}
class shape extends Sphere68 {
    //includes all the class using single object
    public void start(){
        System.out.println("hello");
    }
}
public class java_class_68_Java_Exercise_5_Creating_a_Custom_Package {
    public static void main(String[] args) {
        shape s = new shape();
        System.out.println("surface area of sphere "+s.surface_of_sphere(4));
        System.out.println("surface area of sphere "+s.volume_of_sphere(4));
    }
}
