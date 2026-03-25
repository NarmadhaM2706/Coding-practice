class Notification {
    String name;
    String msg;
    Notification(String name,String msg)
    {
        this.name=name;
        this.msg=msg;
    }
    void send()
    {
    System.out.println("Sending Notification from parent class");
    }

}
class EmailNotification extends Notification{
    EmailNotification(String name,String msg)
    {
        super(name,msg);
    }
    void send()
    {
        System.out.println("Sending email to "+name);
        System.out.println("Message "+msg);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String name,String msg)
    {
        super(name,msg);
    }
    void send()
    {
        System.out.println("Sending SMS to "+name);
        System.out.println("Message "+msg);
    }
}
public class Notify{
    public static void main(String[] args)
    {
        Notification n;
        n= new EmailNotification("test1","Order confirmed");
        n.send();
        n=new SMSNotification("test2","OTP is 23455");
        n.send();
    }
}
