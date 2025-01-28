package academy.dev.dojo.springboot2_essentials.util;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DataUtil {
   public String formatLocalDataTimeToDatabaseStyle(LocalDateTime localDateTime){
       return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
   }
}
