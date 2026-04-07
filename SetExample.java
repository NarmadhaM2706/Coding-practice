import java.util.*;
public class SetExample{
    public static void main(String[] args)
    {
Set<Integer> LinkedSet=new LinkedHashSet<>();
Set<Integer> hset=new HashSet<>();
int[] arr={2,9,45,76,4,5,6,7};
for(int i: arr){
    LinkedSet.add(i);
    hset.add(i); 
}
System.out.println(LinkedSet);
System.out.println(hset);
    }
}