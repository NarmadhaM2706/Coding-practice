public class Wrapper {
     public static Integer test1(String s){
           return Integer.valueOf(s); 
        }
        
    public static void main(String[] args) {
        Integer b = Integer.valueOf("04536");//return type -> object(Integer)
        Integer c= Integer.parseInt("0232242");//return type-> primitive(int)
        int a =b.intValue();//Unboxing
        Integer x=200;
        Integer y=200;
        Integer o =128;
        o=130;
        System.out.println(o);
        System.out.println(x==y);
        System.err.println(x.equals(y));
        //System.out.println(b);
        //System.err.println(c);
        //System.out.println(test1("123"));
    }
}
