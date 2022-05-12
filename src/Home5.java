import java.util.Scanner;

public class Home5 {
    public static void main(String[] arqs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rainbow color number");
        int i =in.nextInt();
        String s = null;
        switch (i) {
            case 1:
                s = "Red";
                break;
            case 2:
                s = "Orange";
                break;
            case 3:
                s = "Yellow";
                break;
            case 4:
                s = "Green";
                break;
            case 5:
                s = "Blue";
                break;
            case 6:
                s = "Dark blue";
                break;
            case 7:
                s = "Purple";
                break;
        }
        System.out.println(s);
    }
}
