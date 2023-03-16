import java.util.*;


public class Main {

    static long[] memo = new long[91];

    public static void main(String[] args) {
        memo[0] = 0;
        memo[1] = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

    }
    static long fibo(int n){
        if(n==0) return n;
        if(memo[n]!=0) return memo[n];
        memo[n] = fibo(n-1)+fibo(n-2);
        return memo[n];
    }

}