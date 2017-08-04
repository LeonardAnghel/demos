package typesafeheterogeneouscontainer;

import java.util.HashMap;
import java.util.Map;

public final class Container {
    
    private final Map<String, Object> container = new HashMap<>();

    public <T> void putObject(final String key, final T instance, final Class<T> type) {
        
        if (type == null) {
            throw new NullPointerException("Type is null");
        }
        
        container.put(key, type.cast(instance));
    }  

    public <T> T getObject(final String key, final Class<T> type) {       
        return type.cast(container.get(key));
    }
    
    public boolean isEmpty() {
        return container.isEmpty();
    }      
}
