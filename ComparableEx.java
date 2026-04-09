import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String  name,int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        List<Student> s= new ArrayList<>();
        s.add(new Student("A",90));
        s.add(new Student("B",74));
        s.add(new Student("C",92));
        Collections.sort(s);
       // for(Student s1:s){
        //    System.out.println(s1.name+" "+s1.mark);
        //}
        System.out.print(s);

    }
}
