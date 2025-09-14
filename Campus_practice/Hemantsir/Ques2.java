import java.util.Scanner;
public class Ques2 {
    //find 15th term
    public static void main(String[] args) {
        //0,0,7,6,14,12,21,18,28
        //0 6 12 18 24 30
        //0 7 14 21 18 28
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={0,0,7,6,14,12,21,18,28};
        //check odd index
        if(n%2==1){
            System.out.println((n/2)*7);
        }
        else{
            System.out.println(((n/2)-1)*6);
        }
    }
}
