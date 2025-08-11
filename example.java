import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        // 格式化日期和时间，精确到秒
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 E HH时mm分ss秒", Locale.CHINA);
        String formattedDate = now.format(formatter);
        
        System.out.println(formattedDate);
    }
}
