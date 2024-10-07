import java.io.*;

public class Practical_30 {
    public static void main(String[] args) {

        try {
            File file1 = new File("myfile1.txt");
            if (file1.createNewFile()) {
                System.out.println("File " + file1.getName() + " is created.");
            } else {
                System.out.println("File " + file1.getName() + " already exists.");
            }

            FileWriter fwrite = new FileWriter("myfile1.txt");
            fwrite.write("Hello, how are you?");
            fwrite.close();

            File file2 = new File("myfile2.txt");
            if (file2.createNewFile()) {
                System.out.println("File " + file2.getName() + " is created.");
            } else {
                System.out.println("File " + file2.getName() + " already exists.");
            }


            FileReader fread1 = new FileReader("myfile1.txt");
            BufferedReader read1 = new BufferedReader(fread1);
            String line;

            FileWriter fwrite2 = new FileWriter("myfile2.txt");
            while ((line = read1.readLine()) != null) {
                fwrite2.write(line + "\n");
            }


            read1.close();
            fwrite2.close();


            FileReader fread2 = new FileReader("myfile2.txt");
            BufferedReader read2 = new BufferedReader(fread2);
            System.out.println("Content of myfile2:");
            while ((line = read2.readLine()) != null) {
                System.out.println(line);
            }


            read2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
