import java.util.Scanner;

public class Home3 {
    public static void main(String[] arqs){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter number n");
    int n =in.nextInt();
    int a;
    a=n%2;
    if (a==0)
        System.out.println("Even");
    else System.out.println("Odd");

    }
}