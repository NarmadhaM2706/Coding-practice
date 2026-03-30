abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel();
    void deviceInfo(){
        System.out.println("It is a device");
    }
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("LIGHT'S ON");
    }
    @Override
    void turnOff()
    {
        System.out.println("LIGHT'S OFF");
    }
    void setLevel()
    {
        System.out.println("LEVEL SET SUCCESSFULLY IN LIGHT");
    }
}
class fan extends SmartDevice
{
    void turnOn()
    {
        System.out.println("FAN ON");
    }
    void  turnOff()
    {
        System.out.println("FAN OFF");
    }
    void setLevel()
    {
        System.out.println("LEVEL SET SUCCESSFULLY IN FAN");
    }
}
interface Remote{
    void change();
}
interface WifiControl{
    void connect();
}
class TV implements Remote,WifiContol{
    @Override
    public void change()//always public
    {
        System.out.println("Change Channel");
    }
    @Override
    public void connect()
    {
        System.out.println("Wifi Connected");
    }
}
public class Smart {
    public static void main(String[] args)
    {
        SmartDevice d =  new  Light();
        d.turnOn();
        d.deviceInfo();//here we use child class object to access the parent class method it is concrete method
        d.setLevel();
        SmartDevice d1 = new fan();
        d1.setLevel();
        Remote r= new TV();//INTERFACE
        r.change();
    }
}
