import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark)
    {
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString(){
        return id+" -> "+name+"-"+mark;
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student(6,"s",56));
        st.add(new Student(3,"d",96));
        st.add(new Student(7,"j",37));
        st.add(new Student(2,"h",86));
        Comparator<Student> byId = new  Comparator<Student>(){
            public int compare(Student a,Student b){
                return a.id-b.id;
            }
        };
        Collections.sort(st,byId);
        System.out.println(st);
    }
}
