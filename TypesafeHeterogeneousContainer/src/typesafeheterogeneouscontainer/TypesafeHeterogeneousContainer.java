package typesafeheterogeneouscontainer;

import java.io.File;

public class TypesafeHeterogeneousContainer {

    public static void main(String[] args) {

        Container container = new Container();
        container.putObject("key-1", "Hello world!", String.class);
        container.putObject("key-2", "Hello to you!", String.class);
        container.putObject("key-3", 45L, Long.class);
        container.putObject("key-4", 45, Integer.class);
        container.putObject("key-5", new File("."), File.class);

        System.out.println("----------------------------------------");
        System.out.println(container.getObject("key-1", String.class));
        System.out.println(container.getObject("key-2", String.class));
        System.out.println(container.getObject("key-3", Long.class));
        System.out.println(container.getObject("key-4", Integer.class));
        System.out.println(container.getObject("key-5", File.class));
        System.out.println(container.getObject("key-5", File.class).getAbsolutePath());
        
        //  java.lang.ClassCastException: Cannot cast java.lang.String to java.lang.Integer
        //System.out.println(container.getObject("key-1", Integer.class));        
    }

}
