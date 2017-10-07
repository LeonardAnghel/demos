package humanize.junit.sample;

import java.util.Locale;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

public class ReadableTest extends BlockJUnit4ClassRunner {

    // UC: Upper case, LC: Lower case
    private static final String UC_BEHIND_ME_UC_FOLLOWED_BY_LC_IN_FRONT_OF_ME = "(?<=[A-Z])(?=[A-Z][a-z])";
    private static final String NON_UC__BEHIND_ME_UC_IN_FRONT_OF_ME = "(?<=[^A-Z])(?=[A-Z])";
    private static final String LETTER_BEHIND_ME_NON_LETTER_IN_FRONT_OF_ME = "(?<=[A-Za-z])(?=[^A-Za-z])";

    @Override
    protected String testName(FrameworkMethod method) {
        return humanize(method.getMethod().getName());
    }

    public ReadableTest(Class<?> klass) throws InitializationError {
        super(klass);
    }

    private static String humanize(String s) {
        return firstLetterCaps(s.replaceAll(
                String.format(Locale.ENGLISH, "%s|%s|%s",
                        UC_BEHIND_ME_UC_FOLLOWED_BY_LC_IN_FRONT_OF_ME,
                        NON_UC__BEHIND_ME_UC_IN_FRONT_OF_ME,
                        LETTER_BEHIND_ME_NON_LETTER_IN_FRONT_OF_ME
                ),
                " "
        ));
    }

    private static String firstLetterCaps(String data) {
        String firstLetter = data.substring(0, 1).toUpperCase(Locale.ENGLISH);
        String restLetters = data.substring(1).toLowerCase(Locale.ENGLISH);
        return firstLetter + restLetters;
    }

}
