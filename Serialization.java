//import java.io.Serializable;
//import java.io.IOException;
//import  java.io.ObjectOutputStream;
//import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
class Student implements Serializable{ 
    String name;
    int mark;

    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream objStream) throws IOException{
        super(objStream);
    }
    @Override
    protected void writeStreamHeader(){

    }
}
public class Serialization{
 public static void main(String[] args) throws IOException{
        Student s= new  Student("ghjjjj",97);
        File file= new File("student.txt");
        FileOutputStream fo= new FileOutputStream(file,true);//open file
        //ObjectOutputStream objStream = new  ObjectOutputStream(fo);//obj to byteStream
        ObjectOutputStream objStream;
        if(file.length() ==0){
            objStream = new ObjectOutputStream(fo);//first time serialization
        }else{
            objStream = new CustomObjectOutputStream(fo);//append to the existing serialization file
        }
        objStream.writeObject(s);
        fo.close();
        objStream.close();
    }
}