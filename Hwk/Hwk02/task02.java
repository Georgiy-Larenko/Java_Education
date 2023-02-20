package Hwk.Hwk02;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

public class task02 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("Hwk","Hwk02","file.txt");

        boolean exists = Files.exists(file);

        if (exists) {
            System.out.println("File already exist. Recreate file.");
            Files.delete(file);
            Files.createFile(file);

            int count = 1;
            while (count < 100) {
                Files.writeString(file, "TEST");
                count += 1;
            }

            
        } else {
            Files.createFile(file);
            Files.writeString(file, "TEST");

            int count = 1;
            while (count < 100) {
                Files.writeString(file, "TEST");
                count += 1;
            }
  
        }
        
        String content = Files.readString(file);
        System.out.println(content);
        
}
        
}
