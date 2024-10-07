import java.io.*;


public class Practical_27 {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello world!\n");
            writer.write("My name is Mahek.");
            writer.close();

            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            int lineCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            System.out.println("Total lines: " + lineCount);

            reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
