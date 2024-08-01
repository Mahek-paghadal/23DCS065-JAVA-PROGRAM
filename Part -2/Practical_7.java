import java.util.Scanner;
public class Practical_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string :");
        String st=sc.next();

        System.out.print("Enter number of times that you want to print the string :");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(st.substring(0,3));

        }
    }
}
