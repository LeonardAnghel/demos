package tvsobject;

public class TvsObject {

    public static void main(String[] args) {
        WithObject wo = new WithObject();
        String hellowo = String.valueOf(wo.doSomething("hello"));
        wo.doSomethingElse("hello");
        System.out.println(hellowo);
        
        WithT wt = new WithT();
        String hellowt = wt.doSomething("hello");
        wt.doSomethingElse("hello", String.class);
        System.out.println(hellowt);                
    }
    
}
