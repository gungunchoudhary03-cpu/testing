package CoreJAVApac;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TC_LAB4_2 {
 public static void main(String[] args) {
     Path path = Paths.get("C:\\Users\\Gungun.Choudhary\\git\\testing\\testing\\JAN2026\\src\\test\\java\\pac1\\text.txt");

     try {
         // Create the file if it doesn't exist
         if (!Files.exists(path)) {
             String content = IntStream.rangeClosed(0, 10)
                     .mapToObj(String::valueOf)
                     .collect(Collectors.joining(","));
             Files.write(path, content.getBytes(StandardCharsets.UTF_8),
                     StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
             System.out.println("Created numbers.txt with: " + content);
         }

         // Read with Scanner and print only even numbers
         System.out.print("Even numbers: ");
         try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
              Scanner scanner = new Scanner(br)) {
             scanner.useDelimiter(",\\s*"); // comma + optional spaces
             while (scanner.hasNext()) {
                 if (scanner.hasNextInt()) {
                     int n = scanner.nextInt();
                     if (n % 2 == 0) {
                         System.out.print(n + " ");
                     }
                 } else {
                     // consume and skip any non-int token gracefully
                     scanner.next();
                 }
             }
         }
         System.out.println();

     } catch (IOException e) {
         System.err.println("I/O error: " + e.getMessage());
     }
 }
}

