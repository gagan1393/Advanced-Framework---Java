import com.qa.config.ConfigFactory;


public class BaseTest {

    public static void main(String[] args) {
        System.out.println(ConfigFactory.getConfig().browserStackURL());


    }
}
