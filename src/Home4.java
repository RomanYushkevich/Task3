import java.util.Scanner;

public class Home4 {
    public static void main(String[] arqs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t");
        int t =in.nextInt();
        if (t>-5)
            System.out.println("Warmly");
        else if (t>-20 && t<=-5)
            System.out.println("Fine");
            else if (t<=-20)
                System.out.println("Cold");
    }
}
