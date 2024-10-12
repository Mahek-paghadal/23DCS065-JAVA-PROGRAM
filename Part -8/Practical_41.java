import java.util.*;
import java.util.Scanner;

public class Practical_41 {
    public static void main(String[] args) {

        Set<String> javaKeywords = new HashSet<>(Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "const", "continue", "default", "do", "double", "else", "enum",
                "extends", "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native", "new", "null",
                "package", "private", "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while"
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Java source code line by line (type 'exit' to finish):");

        int keywordCount = 0;

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            String[] words = line.split("\\W+");

            for (String word : words) {
                if (javaKeywords.contains(word)) {
                    keywordCount++;
                }
            }
        }

        System.out.println("Number of Java keywords in the source code: " + keywordCount);
    }
}
