package Apendice;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class TesteLocalDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        date.getTime();
        date.before(new Date());
        date.getDay();

        Timestamp timestamp = new Timestamp(1688422863);
        System.out.println(timestamp);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


    }
}
