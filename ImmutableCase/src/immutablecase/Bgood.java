package immutablecase;

import java.util.Map;

public class Bgood {

    public void modify() {

        Map<String, String> properties = Agood.getPROPERTIES();

        System.out.println("Intruder ? " + properties.get("intruder"));
        Agood.accidentallyModifyPROPERTIES();
        System.out.println("OPS :(");
        System.out.println("Intruder ? " + properties.get("intruder"));
    }
}
