package immutablecase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Awrong {

    private static final Map<String, String> PROPERTIES;

    static {    
        PROPERTIES = new HashMap<>();
        PROPERTIES.put("url", "URL");
        PROPERTIES.put("username", "Username");
        PROPERTIES.put("password", "Password");        
    }

    public static Map<String, String> getPROPERTIES() {
        return Collections.unmodifiableMap(PROPERTIES);
    }

    public static void accidentallyModifyPROPERTIES() {
        PROPERTIES.put("intruder", "Intruder");

    }
}
