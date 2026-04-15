import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileRead {
    public static void main(String[] args) {
        try{
       // FileReader reader= new FileReader("test.txt"); 
        //int  character;
        //while((character=reader.read()) != -1){ System.out.print((char)character);}

        BufferedReader reader= new BufferedReader(new FileReader("test.txt"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
