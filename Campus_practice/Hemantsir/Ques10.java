import java.util.Scanner;
import java.util.*;
public class Ques10 {
    public static void main(String[] args) {
        // Minimize cost
        /*
         ai[], cost c(x)=|a1+t1|+|a2+t2|+----+|an+tn| n zeros initally
         transfer one array to other if dis b/w them is atmost k 
         3 2
         3 -1 -2 op 0
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
int t[]=new int[n];
Arrays.sort(a);

    }
}
