class User {
    String name;
    String phone;
    String location;
    User(String name,String phone,String location)
    {
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Phone "+phone);
        System.out.println("Location "+location);
    }
}
class Ride extends User{
    String VehType;
    Ride(String name,String phone,String location,String VehType)
    {
        super(name,phone,location);
        this.VehType=VehType;
    }
    void displayRide()
    {
        System.out.println("---Ride user---");
        display();
        System.out.println("Vehicle Type " +VehType);
    }
}
class Food extends User{
    String favfood;
    Food(String name,String phone,String location,String favfood)
    {
         super(name,phone,location);
         this.favfood=favfood;
    }
    void displayFood()
    {
        System.out.println("---Food user---");
        display();
        System.out.println("Favourite Food" + favfood);
    }
}
public  class Task
{
    public static void main(String[] args)
    {
       
       Ride u=new Ride("nandhu","34363","dgdhdj","bike");
        u.displayRide();
        Food v=new Food(" nandhu","243563","dydyd","chapathi");
        v.displayFood();
    }
}