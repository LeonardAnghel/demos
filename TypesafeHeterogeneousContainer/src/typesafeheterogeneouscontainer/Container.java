package typesafeheterogeneouscontainer;

import java.util.HashMap;
import java.util.Map;

public final class Container {

    private final Map<Key<?>, Object> values = new HashMap<>();

    public <T> void put(final Key<T> key, final T value) {
        values.put(key, key.type.cast(value));
    }

    public <T> T get(final Key<T> key) {
        return key.type.cast(values.get(key));
    }
}
