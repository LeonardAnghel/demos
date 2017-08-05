package immutablecase;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Agood {

    private static final Map<String, String> PROPERTIES = 
            ImmutableMap.of("url", "URL", "username", "Username", "password", "Password");
    
    public static Map<String, String> getPROPERTIES() {
        return PROPERTIES;
    }

    public static void accidentallyModifyPROPERTIES() {
        PROPERTIES.put("intruder", "Intruder");

    }
}
