package StreamAplExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo5
 {
     public static void main(String[] args)
     {
         List<String> names = Arrays.asList("Ashok","Ashish","Ramesh", "Kamlesh", "John","Kali","Babu","Ram");
         // print name with its length which are String with "A" using Stream API
                         // Ashok  - 5
                        // Ashish  - 6
                        // John    - 4
                       // Ram      - 3
         names.stream()
                 .filter(name -> name.startsWith("A"))
                 .map(name -> name + "- " +name.length())
                 .forEach(name -> System.out.println(name));
     }
}
