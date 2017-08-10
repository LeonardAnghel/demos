package tvsobject;

public class WithT {

    public <T> T doSomething(T t) {
        return t;
    }
    
    public <T> void doSomethingElse(T t, Class<T> clazz) {        
        // use clazz.cast(t)
    }
}
