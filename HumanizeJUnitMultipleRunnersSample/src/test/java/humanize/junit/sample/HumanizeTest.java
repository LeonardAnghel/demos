package humanize.junit.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(ReadableTest.class)
public class HumanizeTest {

    // Mockito 1.10.19+
    @Rule
    public final MockitoRule mockitoRule = MockitoJUnit.rule();

    // before Mockito 1.10.19
    //@Rule public final MockitoJUnitRule mockito = new MockitoJUnitRule(this);
    
    @Test
    public void givenMockedComparableWhenCompareToThenReturnOne() {
        Comparable comparable = mock(Comparable.class);
        when(comparable.compareTo("Test")).thenReturn(1);
        
        assertEquals(1, comparable.compareTo("Test"));
    }
}
