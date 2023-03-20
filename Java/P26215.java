import javax.swing.*;
import java.util.*;


public class Main {

    static ArrayList<Integer> snow = new ArrayList<>();
    static int minute = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) snow.add(i,sc.nextInt());

        while(minute<=1440){
            int idx1=0, idx2=1;

            Collections.sort(snow,Collections.reverseOrder());

            if(snow.get(0)==0){
                break;
            }
            try {
                if (snow.get(1) != 0) {
                    wipe(idx1, idx2);
                } else {
                    wipe(idx1);
                }
            }catch (IndexOutOfBoundsException e ){
                wipe(idx1);
            }
        }
        if(minute<=1440){
            System.out.println(minute);
        }
        else{
            System.out.println("-1");
        }



    }
    static void wipe(int idx){
        snow.set(idx,snow.get(idx)-1);
        minute++;
    }
    static void wipe(int idx1, int idx2){
        snow.set(idx1,snow.get(idx1)-1);
        snow.set(idx2,snow.get(idx2)-1);
        minute++;
    }


}