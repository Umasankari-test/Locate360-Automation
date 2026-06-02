package StepDefinition;

import io.cucumber.java.After;
import com.base_class.BaseClass;

public class Hooks extends BaseClass {

    @After
    public void quitDriver() throws InterruptedException {
    	Thread.sleep(4000);
        driver.quit();
    }
}