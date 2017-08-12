package typesafeheterogeneouscontainer;

public class TypesafeHeterogeneousContainer {

    public static void main(String[] args) {

        Container container = new Container();                
        container.put(Key.key("id-1", String.class), "value-1");
        container.put(Key.key("id-2", Integer.class), 0);                
        
        System.out.println(container.get(Key.key("id-1", String.class)));
        System.out.println(container.get(Key.key("id-2", Integer.class)));
        System.out.println(container.get(Key.key("id-3", Integer.class)));
    }

}
