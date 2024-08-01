import java.util.Scanner;
public class Practical_8 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int count=0;
        System.out.print("Enter size of an array :");
        int n = sc.nextInt();
        int arr[]=new int[n];

        for (int i =0;i<n;i++)
        {
            System.out.print("Enter the " + i+1 + " element of an array :");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]==9){
                count++;
            }
        }
        System.out.println("Number 9 appears "+ count + " times ");
    }
}
