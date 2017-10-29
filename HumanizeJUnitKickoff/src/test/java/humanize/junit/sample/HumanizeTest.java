package humanize.junit.sample;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class HumanizeTest {

    private static final Logger logger = Logger.getLogger(HumanizeTest.class.getName());        

    @Rule
    public final TestName testName = new TestName();
    
    @Before
    public void setUp() {
        logger.log(Level.INFO, "Test name:{0}", HumanName.humanize(testName.getMethodName()));
    }

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
