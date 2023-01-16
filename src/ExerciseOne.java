import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseOne {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a text file.");
            writer.write("\nHere is another line to write.");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
