import java.util.*;
public class Ques9 {
       public static void main(String[] args) {
        //Fun game + SAP
        /*
        a-> Start list
        b-> end list
        n-> no. 
         a>b op 1 b remove
         a<b op 2 a remove picked
         a==b op 0 a and b
         3 1 2 3
         2 2 0
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String st="";
        int s=0,e=n-1;
            while(s<=n-1 && e>=0){
        if(a[s]>a[e]){
            st+="1"+" ";
            e--;
        }
        else if(a[s]<a[e]){
            st+="2"+" ";
            s++;
        }
        else{
            st+="0"+" ";
            s++;
            e--;
        }
}
    System.out.println(st);
    }
}
