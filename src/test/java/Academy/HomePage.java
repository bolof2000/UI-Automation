package Academy;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class HomePage extends Base{

    @Test
    public void basePageNavigation() throws IOException {

        driver = initializeDrivers();
        driver.get("http://qaclickacademy.com");
        driver.close();
    }
}
