public class Home14 {
    public static void main(String[] arqs){
        int n=0;
        for (int i=0;i<=10;i++) {
            if (i==0) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
            else {
                System.out.print(i);
                for (int j = 1; j <= 10; j++) {
                    n = i * j;
                    System.out.print(" " + n);
                }
                System.out.println("");
            }
        }
    }
}
