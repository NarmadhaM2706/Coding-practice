public class NonRepeat
{
    public static void main(String[] args)
    {
        String str="leetcode";
        int[] freq = new int[26];
        char[] ch=str.toCharArray();
        for(char c:ch)
        {
            freq[c-'a']++;
        }
       for(int i=0;i<ch.length;i++)
       {
            if(freq[ch[i]-'a'] == 1)
                System.out.print(ch[i]);
            break;
       }
    }
}