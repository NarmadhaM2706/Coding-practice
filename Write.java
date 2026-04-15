import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class Write {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using fileWriter1");
            writer.newLine();
            writer.write("Write using fileWriter2");
            writer.newLine();
            writer.write("Write using fileWriter3");
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
  }