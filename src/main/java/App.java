import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zxj
 * @date 2018/3/1 9:58
 */
@SpringBootApplication
@ComponentScan({"com.cy"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
