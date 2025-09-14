import java.util.Arrays;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int c=0;
            for(int i=0;i<n-1;i++){
                arr[i+1]=arr[i]+arr[i+1];
            c+=arr[i+1];
            }
        
        System.out.println(c);
        }
    }
}
