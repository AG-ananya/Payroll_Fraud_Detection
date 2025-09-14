import java.util.ArrayList;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int arr[]=new int[n];
        System.out.println("Enter age: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<120){
            if(arr[i]<17){
                sum+=200;
            }
            else if(arr[i]>=17 && arr[i]<40){
                sum+=400;
            }
            else if(arr[i]>=40){
                sum+=300;
            }
        }
    }
        System.out.println("Total income "+sum+" INR");
    }
}
