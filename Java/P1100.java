import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        String chess;
        int j;
        for(int i=0;i<8;i++){
            chess = sc.nextLine();
            j = i%2==0?0:1;
            for(;j<8;j+=2){
                if(chess.charAt(j)=='F')
                    sum++;
            }

        }
        System.out.println(sum);

    }

}