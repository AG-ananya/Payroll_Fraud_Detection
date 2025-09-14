import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
       // print fibonacci triangle
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
            int a=1,b=1;
            System.out.print(a+" ");
            for(int j=1;j<i;j++){
                System.out.print(b+" ");
            int temp=a+b;
            a=b;b=temp;
            }
        System.out.println();
        }
    
}
}

