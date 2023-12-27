package Home_Work.Seminar_1;

import java.io.FileWriter;
import java.io.IOException;

public class File_save {

    public void  safeAtFile(String text ) throws IOException {
        FileWriter input = new FileWriter("result.txt", true);
        input.write(text);
        input.write("\n");
        input.flush();
    }
}
