import java.util.*;
class User{
    String name;
    String phone;
    String address;
    String role="User";
    User(String name)
    {
        this.name=name;
        System.out.println("User created");
    }
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Role "+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle)
    {
        super(name);
        this.vehicle=vehicle;
        System.out.println("Name : "+ name + " driving " + vehicle);
        System.out.println("Role : "+ role);//super.role it will call the parent role
    }
    void displaydriver()
    {
        super.display();
        System.out.println("Vehicle "+ vehicle);
        System.out.println("Driver class role: "+role);
        System.out.println("User class role: "+super.role);
    }
}
/*class FoodUser extends User{
    String favoritefood;
    FoodUser()
    {
        System.out.println("FoodUser Created");
    }
}
class TravelUser extends User{
    String preferredVehicle;
}*/
public class App
{
public static void main(String[] args)
{
    //FoodUser fu=new FoodUser();
    Driver d= new Driver(" Abc","Bike");
d.displaydriver();
}
}