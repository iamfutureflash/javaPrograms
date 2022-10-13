package CodeWithHarry;

class cylender{
    private int radius , height;
    public cylender(int user_radius, int user_height){radius = user_radius;height = user_height;}
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int user_radius){
        this.radius = user_radius;
    }
    public void setHeight(int user_height){
        this.height = user_height;
    }
}
class sfa_vol_cylender {
    private float radius, heights;
    float pi = 3.14f;
    float result;

    public sfa_vol_cylender(float user_radius, float user_heights) {
        radius = user_radius;
        heights = user_heights;
        surface_area(radius, heights);
        volume(radius, heights);
    }
    public void surface_area(float radius, float height) {
        result = 2 * pi * radius * (height +  radius);
        System.out.println("surface area of cylender is :- " + result);
        result = 0;
    }
    public void volume(float radius, float heights){
        result = pi*radius*radius*heights;
        System.out.println("Volume of cylender is :- " + result);
    }
    public float getRadius(){
        return radius;
    }
    public float getHights(){
        return heights;
    }
    public void setRadius(int user_radius){this.radius = user_radius;}
    public void setHights(int user_heights){this.heights = user_heights;
    }
}
public class java_class_44_Exercise_on_Access_Modifiers_and_Constructors {
    public static void main(String[] args) {
//problem 01 and Problem 03 and 05 is included
    /*
        Problem no 1
         cylender one = new cylender(2,8);
         one.setRadius(5);
         System.out.println("radius :- " + one.getRadius());
         System.out.println("height :- " + one.getHeight());
         one.setHeight(15);
         System.out.println("height :- " + one.getHeight());
*/
//problem 02

        sfa_vol_cylender one = new sfa_vol_cylender(5, 10);
    }
}
