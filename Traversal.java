import java.util.*;
public class Traversal{
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       /*for(int i:list){
            if(i==4){
                list.remove(i);
            }
            System.out.println(i);
        }*/

        Iterator<Integer> it1 = list.iterator();
        while(it1.hasNext())
        {
            int current =it1.next();
            if(current==4){
                it1.remove();
            }
        }
               //   System.out.println(list);
      
        ListIterator<Integer> it= list.listIterator(list.size()) ;
        while(it.hasPrevious()){
            int prev=it.previous();
            System.out.print(prev);
        }
        
    }
}