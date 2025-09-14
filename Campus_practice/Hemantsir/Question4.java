//best index-> hackerearth question
import java.util.Scanner;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        //Selection in mpcs exam
        // display the most fit trainee and the highest avg oxygen level 3 rounds batch of three tainee ip 95 92 95 92 90 92 90 92 90  op trainee no: 1 trainee no: 3
        Scanner sc=new Scanner(System.in);
        int n=9;
        int arr[]=new int[n];
        //int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        double a=Math.ceil((arr[0]+arr[3]+arr[6])/3);
        double b=Math.ceil((arr[1]+arr[4]+arr[7])/3);
        double c=Math.ceil((arr[2]+arr[5]+arr[8])/3);
        int max=(Math.max((Math.max((int)a, (int)b)),(int)c));
        if(max==(int)a){
            System.out.println("trainee no. : 1");
        }
if(max==(int)b){
    System.out.println("trainee no.: 2");
}
 if(max==(int)c){
    System.out.println("trainee no.: 3");
}
        
    }
}
