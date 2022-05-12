import java.util.Scanner;

public class Home13 {
    public static void main(String[] arqs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter months");
        int n =in.nextInt();
        System.out.println("Enter sum");
        float s = in.nextInt();
        float sum=0, p=0.07f;
        for (int i=1;i<=n;i++)
            if (i==1)
                sum= (s+s*p);
            else sum= (sum+sum*p);
        System.out.println(sum);
        }
    }
