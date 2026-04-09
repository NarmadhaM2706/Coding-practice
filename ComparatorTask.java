import java.util.*;
class Product
{
    String name;
    int price;
    double rating;
    Product(String name,int price,double rating)
    {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return name+"->" +price+"->"+rating;
    }
}
public class ComparatorTask {
    public static void main(String[] args) {
        List<Product> pro=new ArrayList<>();
        pro.add(new  Product("a", 456, 4));
        pro.add(new  Product("b", 8676, 6));
        pro.add(new  Product("c", 34536, 2));
        Comparator<Product> byName=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return a.name.compareTo(b.name);
            }
        };
        Comparator<Product> byPrice=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return a.price-b.price;
            }
        };
        Comparator<Product> byRating=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return Double.compare(a.rating,b.rating);
            }
        };
        Collections.sort(pro,byName);
        System.out.println(pro);
        Collections.sort(pro,byPrice);
        System.out.println(pro);
        Collections.sort(pro,byRating);
        System.out.println(pro);
    }
}
