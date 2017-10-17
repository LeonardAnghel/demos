package unmodifiable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Agood {

    private static final Map<String, String> PROPERTIES;

    static {    
        Map<String, String> properties = new HashMap<>();        
        properties.put("url", "URL");
        properties.put("username", "Username");
        properties.put("password", "Password");        
        
        PROPERTIES  = Collections.unmodifiableMap(properties);
        properties = null;
    }

    public static Map<String, String> getPROPERTIES() {
        return PROPERTIES;
    }

    public static void accidentallyModifyPROPERTIES() {
        PROPERTIES.put("intruder", "Intruder");

    }
}
