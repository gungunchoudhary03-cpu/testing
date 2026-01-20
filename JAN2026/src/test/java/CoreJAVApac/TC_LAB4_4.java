package CoreJAVApac;


//File: Lab4ProductSort.java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TC_LAB4_4 {
public static void main(String[] args) {
   // Store product names in ArrayList
   List<String> products = new ArrayList<>(Arrays.asList(
       "Keyboard", "mouse", "Webcam", "adapter", "Laptop Stand", "monitor"
   ));

   // Sort case-insensitively
   Collections.sort(products, String.CASE_INSENSITIVE_ORDER);

   // Display using for-each loop
   System.out.println("Sorted products:");
   for (String p : products) {
       System.out.println(p);
   }
}
}
