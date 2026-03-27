public class even {
    public static void main(String[] args)
    {
        String str="words  with even length";
        boolean isWord=false;
        int len=0;
        StringBuilder sb= new StringBuilder();
        int start=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch != ' ')
            {
                if(!isWord)
                {
                len=0;
                isWord=true;
                start=i;
                }
                len++;
            }
            else
            { 
                if(isWord && len %2==0)
                {
                    for(int j=start;j<=i;j++)
                    sb.append(str.charAt(j));
                }
                isWord=false;
            }
        }
        if(len %2==0)
        {
            for(int j=start;j<str.length();j++)
            sb.append(str.charAt(j));
        }
        System.out.print(sb.toString());
    }
}
