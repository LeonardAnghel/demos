package junit.collector.sample;

import static org.junit.Assert.assertEquals;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;

public class BaseErrorCollector {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    // This boolean can be used by the client of this class 
    // to enable(default) / disable the ErrorCollector 
    private boolean fatal;

    public void equalsToCollector(Object actual, Object expected) {
        if (getFatal()) {
            assertEquals(actual, expected);
        } else {
            collector.checkThat(actual, CoreMatchers.equalTo(expected));
        }
    }

    public void setFatal(boolean fatalFlag) {
        fatal = fatalFlag;
    }

    public boolean getFatal() {
        return fatal;
    }
}
