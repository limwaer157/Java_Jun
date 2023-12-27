package Home_Work.Seminar_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter you text - ");
        Scanner a = new Scanner(System.in);
        String text = a.nextLine();
        DataTime dataTime  = new DataTime();
        File_save fileSave = new File_save();
        fileSave.safeAtFile(dataTime.addTime(text));
    }
}
