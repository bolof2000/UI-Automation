package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileStore;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir")+"/src/test/java/configs/config.properties" );
        Properties config = new Properties();
        FileInputStream fis = new FileInputStream("/Volumes/TECH/Automations/UI-Automation/src/test/java/configs/config.properties");
        config.load(fis);
        System.out.println(config.getProperty("url"));
    }


}
