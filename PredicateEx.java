import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}
public  class PredicateEx{
    public static void main(String[] args){
        /*Predicate<Integer> isEven=new Predicate<Integer>(){
            public boolean test(Integer n){
                return n%2==0;
            }
        };*/
        Predicate<Integer> isEven  = (n)-> n%2==0;
        Predicate<Integer> isOdd=isEven.negate();
        Predicate<String> check=(s)->(s.startsWith("a") || s.startsWith("A"));
        Predicate<Student> isPass=(s)->s.mark>40;
        System.out.println("Even: "+isEven.test(999));
        System.out.println("Odd: " + isOdd.test(999));
        System.out.println("StartingLetter: "+check.test("Abi"));
        System.out.println("Pass or Fail: "+isPass.test(new Student(100)));
    }
}