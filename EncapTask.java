class Locker
{
    private int Lockerid;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    Locker(int Lockerid,int pinCode){
        this.Lockerid=Lockerid;
        this.pinCode=pinCode;
        this.isLocked=true;
    }
    public void StoreItem(String item,int pin)
    {
        if(pin==pinCode)
        {   
            if(!isLocked)
            {
                storedItem=item;
                System.out.println("Stored successfully");
            }
            else{
                System.out.println("Locker Locked");
            }
        }
        else{
            System.out.println("Invalid pin ");
        }
    }
    public void retriveItem(int pin)
    {
        if(pin == pinCode)
        {
            if(!isLocked && storedItem != null)
            {
                System.out.println("Retrived Item "+ storedItem);
                storedItem=null;
            }
            else if(storedItem == null){
                System.out.println("Locker is Empty");
            }
            else{
                System.out.println("Locker is locked");
            }
        }else{
            System.out.println("pin is wrong");
        }

    }
    public void lock()
    {
        isLocked=true;
        System.out.println("Locker locked");
    }
    public void unLock(int pin)
    {
        if(pin == pinCode)
        {
            isLocked=false;
            System.out.println("Loker is unlocked");
        }
        else{
            System.out.println("Wrong pin");
        }
    }
}
public class EncapTask
{
    public static void main(String[] args)
    {
        Locker l = new Locker(123,2222);
        l.unLock(2222);
        l.StoreItem("Diamond",2222);
        l.retriveItem(2222);
        l.lock();
    }
}