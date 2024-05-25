import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        File myFile = new File("notunFile.txt");
        // CREATING A NEW FILE
        // Check if the file exists
        try {
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error creating file!");
            e.printStackTrace();
        }
        // TO WRITE INTO THE FILE
        try {
            FileWriter fileWriter = new FileWriter("notunFile.txt");
            fileWriter.write("This is my new file using file handling");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TO read AN EXISTING FILE
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
