package immutablecase;

import java.util.Map;

public class Bwrong {
 
    public void modify(){
     
    Map<String, String> properties = Awrong.getPROPERTIES();
    
    System.out.println("Intruder ? "+properties.get("intruder"));    
    Awrong.accidentallyModifyPROPERTIES();    
    System.out.println("OPS :(");    
    System.out.println("Intruder ? "+properties.get("intruder"));            
    }        
}
