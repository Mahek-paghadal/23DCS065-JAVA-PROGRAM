import java.util.Scanner;

class Practical_15{
    Practical_15(int length , int breath){
        int a = length;
        int b = breath;
    }

    static int reaturnArea(int length , int breath)
    {
        int area = length * breath;
        return area;
    }
}

class practical14{

public static void main(String args[]) {
    Practical_15 r;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a :");
    int a = sc.nextInt();
    System.out.print("Enter value of b :");
    int b = sc.nextInt();
    System.out.println("Area of rectangle : " + Practical_15.reaturnArea(a,b));
}
}
