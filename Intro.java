import java.util.*;
public class Intro {
    public static void main(String[] args) {
        task1();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From Task1 "+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From Task2 "+i);
        }
    }
}
