import java.util.Scanner; public class Practical_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float exp[] = new float[5];
        System.out.print("Enter number of expense : ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i<n; i++) {
            System.out.print("Enter your "+ (i+1) + " expense :");
            exp[i]=sc.nextFloat(); sum+= exp[i];
        }
        System.out.println("Total expense is : " + sum);
    }
}


