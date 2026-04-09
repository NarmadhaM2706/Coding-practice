import java.util.*;
public class TreeSetEx {
    public static int closest(int[] arr,int target)
    {
        TreeSet<Integer> ts=  new TreeSet<>();
        for(int i:arr){
            ts.add(i);
        }
        ts.remove(target);
        Integer ceil=ts.ceiling(target);
        Integer floor=ts.floor(target);
        if(ceil==null) return floor;
        if(floor==null)return ceil;
        return (Math.abs(ceil-target) < Math.abs(target-floor)) ? ceil:floor;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,9,15};
        int target=9;
        System.out.println(closest(arr,target));
    }
}
