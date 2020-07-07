package cucumber.pages;

import cucumber.config.Config;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Config.class)
public class test {


    @Test
    public void test() {
        Page page = new Page();
        page.setUp();
    }
}
