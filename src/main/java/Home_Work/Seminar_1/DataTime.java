package Home_Work.Seminar_1;

import java.sql.Date;
import java.time.LocalDateTime;

public class DataTime {
    LocalDateTime t = LocalDateTime.now();


    public   String addTime(String a){
        String newStr = "Adding to file : "+ t +" --> " + a ;
        return newStr;
    }
}
