package humanize.junit.sample;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ReadableTest.class)
public class HumanizeTest {
    
    @Test
    public void givenCredentialsWhenLoginUserThenReturnUserNickname() {
        assertTrue(true);
    }

    @Test
    public void givenProductWhenAddInCartThenIncreaseTotal() {
        assertTrue(true);
    }
    
    @Test
    public void givenTestCoverageWhen99DoneThenSuccess() {
        assertTrue(true);
    }
}
