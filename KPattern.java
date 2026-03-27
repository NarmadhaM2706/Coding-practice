import java.util.Scanner;

public class KPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int mid=n/2;
        int m=n-1;
        for(int i=0;i<n;i++)
        {
            System.out.print(str.charAt(i));
           if(i<=mid){
            for(int j=0;j<mid-i;j++)
            {
                System.out.print(" ");
            }
           }
           else{
            for(int j=0;j<i-mid;j++)
            {
                System.out.print(" ");
            }
           }
           System.out.print(str.charAt(m)); m--;
           System.out.println();
        }
        
    }
}
