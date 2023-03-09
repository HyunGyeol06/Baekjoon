import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isHanSu(i)) {
                sum++;
                //System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    static boolean isHanSu(int n){
        if(n <= 9) return true;
        ArrayList<Integer> num = toArray(n);
        int idx = num.size();
        for(int i = -9;i<=9;i++){
            for(int j=0;j<idx-1;j++){
                if(num.get(j)+i != num.get(j+1)) break;
                if(j==idx-2){
                    return true;
                }
            }
        }
        return false;
    }

    static ArrayList<Integer> toArray(int n){
        ArrayList<Integer> arrNum = new ArrayList<Integer>(5);
        while(n > 0) {
            arrNum.add(n % 10);
            n /= 10;
        }
        return arrNum;
    }

}