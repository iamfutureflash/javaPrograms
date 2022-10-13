package CodeWithHarry;
class employee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class java_class_40_access_modifiers {
    public static void main(String[] args) {
        employee harry = new employee();
        harry.setName("harry");
        harry.setId(12);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
