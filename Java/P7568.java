import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[50];
        int[] weight = new int[50];
        int[] rank = new int[50];

        for(int i =0;i<n;i++){
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            rank[i] = getRank(height,weight,n,i);
        }
        for(int i =0;i<n;i++) System.out.printf("%d ",rank[i]);


    }

    static int getRank(int[] height, int[] weight,int n, int idx){
        int rank = 1;
        int my_height = height[idx];
        int my_weight = weight[idx];
        for(int i =0;i<n;i++){
            if(i==idx) continue;
            if(height[i]>my_height&&weight[i]>my_weight) rank++;
        }
        return rank;

    }

}