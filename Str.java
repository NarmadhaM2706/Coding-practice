public class Str
{
    public static void main(String[] args)
    {
        String str="VIRATKOHLI";
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i+=2)
        {
            sb.append(str.charAt(i));
        }
        for(int i=1;i<str.length();i+=2)
        {
            sb.append(str.charAt(i));
        }
        System.out.println(new String(sb));
    }
}