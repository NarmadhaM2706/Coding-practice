import java.util.*;
public class MapTask {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr={1,2,2,3,3,1,3,4,5,2};
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey() + " -> "+entry.getValue()+" times");
        }
    }
}
