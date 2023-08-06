package HW_third;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingtoFile {
    public static void writeToFile(Human human) throws IOException {
        FileWriter writer = new FileWriter(new File(human.surname + ".txt"), true);
        writer.write(human.toString() + "\n");
        writer.close();
    }
}


