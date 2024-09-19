import java.util.Scanner;

class Complex{

    void sum(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1 + r2;
        int i = i1 + i2;
        System.out.println("Sum of two numbers are :" + r + " + " + i + "i" );
    }

    void difference(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1 - r2;
        int i = i1 - i2;
        System.out.println("Difference of two numbers are :" + r + " + " + i + "i" );
    }

    void multiplication(int r1 , int i1 , int r2 , int i2)
    {
        int r = r1*r2 - i1*i2;
        int i = r1*i2 + i1*r2;
        System.out.println("Multiplication of two numbers are :" + r + " + " + i + "i" );
    }
}

public class Practical_16 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Number 1 :");
        System.out.print("Enter the real part :");
        int r1= sc.nextInt();
        System.out.print("Enter the imaginary part :");
        int i1= sc.nextInt();
        System.out.println();

        System.out.println("For Number 2 :");
        System.out.print("Enter the real part :");
        int r2= sc.nextInt();
        System.out.print("Enter the imaginary part :");
        int i2= sc.nextInt();
        System.out.println();
        Complex c = new Complex();
        c.sum(r1,i1,r2,i2);
        c.difference(r1,i1,r2,i2);
        c.multiplication(r1,i1,r2,i2);

    }
}
