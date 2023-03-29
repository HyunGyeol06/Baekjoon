import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = 0.00D;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            double p = sc.nextDouble();
            v = 1-(1-v)*(1-p/100);
            String v2 = String.format("%.6f", v*100);
            System.out.println(v2);
        }
    }
}