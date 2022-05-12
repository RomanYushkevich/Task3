import java.util.Scanner;

public class Home2 {
    public static void main(String[] arqs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of month");
        int i =in.nextInt();
        String s = null;
        if (i<=2)
            s="Winter";
        else if (i>=3 && i<=5)
                s="Spring";
                else if (i>=6 && i<=8)
                        s="Summer";
                    else if (i>=9 && i<=11)
                            s="Autumn";
                        else s="Winter";
        System.out.println(s);
    }
}
