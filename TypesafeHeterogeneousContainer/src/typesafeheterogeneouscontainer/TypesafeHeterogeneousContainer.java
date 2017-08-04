package typesafeheterogeneouscontainer;

import java.io.File;

public class TypesafeHeterogeneousContainer {

    public static void main(String[] args) {

        Container container = new Container();
        container.putInstance("key-1", "Hello world!", String.class);
        container.putInstance("key-2", "Hello to you!", String.class);
        container.putInstance("key-3", 45L, Long.class);
        container.putInstance("key-4", 45, Integer.class);
        container.putInstance("key-5", new File("."), File.class);

        System.out.println("----------------------------------------");
        System.out.println(container.getInstance("key-1", String.class));
        System.out.println(container.getInstance("key-2", String.class));
        System.out.println(container.getInstance("key-3", Long.class));
        System.out.println(container.getInstance("key-4", Integer.class));
        System.out.println(container.getInstance("key-5", File.class));
        System.out.println(container.getInstance("key-5", File.class).getAbsolutePath());
        
        // java.lang.ClassCastException: Cannot cast java.lang.String to java.lang.Integer
        System.out.println(container.getInstance("key-1", Integer.class));        
    }

}
