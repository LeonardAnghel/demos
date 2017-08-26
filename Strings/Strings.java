package org.commons.util;

import java.util.Objects;

public final class Strings {
    
    private static final String ILLEGAL_ARGUMENT_EXCEPTION_ERR_MSG 
            = "The provided elements were null; non-null elements must be provided.";
    
    private Strings() {
        throw new AssertionError();
    }
        
    public static <T> String concat(final T... elements) {
        
        if(Objects.isNull(elements)) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_EXCEPTION_ERR_MSG);
        }
                
        StringBuilder resultOfConcat = new StringBuilder();
        
        for(T element: elements) {
            resultOfConcat.append(element);
        }
        
        return resultOfConcat.toString();
    }
}
