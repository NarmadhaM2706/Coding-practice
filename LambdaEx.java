@FunctionalInterface
interface Math{
    int add(int a,int b);
}
interface Exercise{
    void sayHello();
}
public class LambdaEx{
    public static void main(String[] args){
        Math obj=(a,b)->a+b;
        /*Math obj= new Math(){
        public int add(int a,int b){
            return a+b;
        }
        };*/
        Exercise obj1=()-> System.out.println("Hello World");;
        obj1.sayHello();
        System.out.println(obj.add(22,33));
    }
}
