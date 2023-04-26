package JavaImport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateSample01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

       LocalDateTime datetime = LocalDateTime.now();

       System.out.println(datetime);

       LocalDateTime nextWeek = datetime.plusWeeks(1);
       System.out.println(nextWeek);


       DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

       String date = datetime.format(fomatter);

       System.out.println(date);
    }

}
