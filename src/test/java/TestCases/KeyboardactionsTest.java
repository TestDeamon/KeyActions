package TestCases;

import config.base;
import org.testng.annotations.Test;

public class KeyboardactionsTest extends base {
    @Test
    public void test() throws InterruptedException {
        Thread.sleep(4000);
        keyboardactions.all();
    }
}
