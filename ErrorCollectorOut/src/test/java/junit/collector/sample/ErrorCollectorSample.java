package junit.collector.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ErrorCollectorSample extends BaseErrorCollector {

    private static final String USER_NAME = "Mike";
    private static final String USER_SURNAME = "Dodge";
    private static final String USER_ADDRESS = "Street 45, TXK";
    private static final String USER_PHONE = "0040-3443-5554";
    private static final String USER_ZIP = "345-2233";
    private static final String USER_SSN = "908-222-333-111";
    private static final int USER_AGE = 23;

    private User user;
  
    @Before
    public void setUp() throws Exception {
        user = new User(USER_NAME, USER_SURNAME, USER_ADDRESS, USER_PHONE, USER_ZIP, USER_SSN, USER_AGE);
    }

    @Test
    public void givenUserThenAssertEqualsUserViaCollector() throws Exception {
        
        // disable ErrorCollector effect (stop collecting failures)
        // setFatal(true);
        
        equalsToCollector(user.getName(), USER_NAME);
        equalsToCollector(user.getSurname(), USER_SURNAME);
        equalsToCollector(user.getAddress(), USER_ADDRESS);
        // fail
        equalsToCollector(user.getPhone(), "555-0909-533");
        // fail
        equalsToCollector(user.getZip(), "111-1111");
        equalsToCollector(user.getSsn(), USER_SSN);
        // fail
        equalsToCollector(user.getAge(), 32);
        // Test report all failures
    }
    
    @Test
    public void givenUserThenAssertEqualsUserViaAssertEquals() throws Exception {
        assertEquals(user.getName(), USER_NAME);
        assertEquals(user.getSurname(), USER_SURNAME);
        assertEquals(user.getAddress(), USER_ADDRESS);
        // fail
        assertEquals(user.getPhone(), "555-0909-533");
        // Test will stop here
        assertEquals(user.getZip(), "111-1111");
        assertEquals(user.getSsn(), USER_SSN);
        assertEquals(user.getAge(), 32);
    }
    
}
