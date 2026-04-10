import java.util.*;
public class FreqSort {
    public static  List<Character> shorChar(String s){
        Map<Character,Integer> map=new HashMap<>();
        //frequency
        for(char ch:s.toCharArray())
    {
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    //Map stored in list
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
    //short
    Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>()
        {
        @Override
        public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b){
            if(!a.getValue().equals(b.getValue())){
            return b.getValue()-a.getValue();
        }
        return a.getKey() - b.getKey();
        }
        });
    List<Character> result=new ArrayList<>();
    //list(map entries) -> list(character)
    for(Map.Entry<Character,Integer> i: list){
        result.add(i.getKey());
    }
    return result;
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.print(shorChar(s));
    }
}
