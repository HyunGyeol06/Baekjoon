import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        int min = 0;
        int sum = 0;
        boolean isFirst = true;
        m = sc.nextInt();
        n = sc.nextInt();
        for(;m<=n;m++){
            if(isPrime(m)){
                if(isFirst){
                    min=m;
                    isFirst = false;
                }
                sum = sum+ m;
            }
        }
        if(sum!=0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }

    }

    static public boolean isPrime(int n) {
        if(n==1) return false;
        int idx = (int)Math.sqrt(n);
        for (int i = 2; i<=idx; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}