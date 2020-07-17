import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.test.aaa.TestBase;

public class JustTest extends TestBase {

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @Test
    public void testFirst(){
        driver.get("http://google.com");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
