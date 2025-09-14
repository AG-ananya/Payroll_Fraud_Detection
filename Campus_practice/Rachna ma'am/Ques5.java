import java.util.ArrayList;

public class Ques5{
    public static void main(String args[]){
        /*
        You are given an array of integers, arr, and  an integer k your task is to find and print the max no. in each contiguous window k
        arr[1,3,-1,-3,5,3,6,7] k=3
        op=[3,3,5,5,6,7] 
         */
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3,c=0;
        ArrayList<Integer>li=new ArrayList<>();
        int s=0;
        for(int i=0;i<arr.length;i++){
           while(c<k){
            s+=arr[i];
            c++;
           }
           if(c==k){
           li.add(s);
            }
                            s=0;c=0;

        }

System.out.println(li);
    }
}