public class Home12 {
    public static void main(String[] arqs){
        int sum=0,sum1=0,n=0;
        for (int i=0;i<10;i++) {
            if (i == 0) {
                sum1 = i;
                System.out.println(i);
            } else if (i == 1) {
                sum = i;
                sum1=sum;
                System.out.println(sum);
                System.out.println(sum);
            } else {
                n=sum;
                sum = sum + sum1;
                System.out.println(sum);
                sum1 = n;
            }
        }
    }
}
