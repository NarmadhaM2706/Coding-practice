public class Except
{
    public static void main(String[] args)
    {
        try
        {
           // int a=6;
            //int b=0;
           // int c=a/b;
            String s=null;
           // System.out.println(c);
           System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("number is divided by zero");
        }
            catch(NullPointerException e)
        {       
            System.out.println("String value is null");
        }

    }
}