import java.util.Arrays;
import java.util.Scanner;
//sum of min subarray of size 3
public class subarray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<3;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
