package typesafeheterogeneouscontainer;

import java.util.Objects;

public class Key<T> {

    final String identifier;
    final Class<T> type;

    public Key(String identifier, Class<T> type) {
        this.identifier = identifier;
        this.type = type;
    }

    public static <T> Key<T> key(String identifier, Class<T> type) {
        return new Key<>(identifier, type);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.identifier);
        hash = 53 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Key<?> other = (Key<?>) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

}
