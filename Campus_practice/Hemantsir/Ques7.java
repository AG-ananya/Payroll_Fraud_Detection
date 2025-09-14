import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        //Roy and profile picture
    /*
    min dim: l*l 
    n photos w*h roy photo 
     w and h<l
     w and h :
     square 
     prompt to crop : crop it
     */
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int n=sc.nextInt();
    int w=0,h=0;
    while(n-->0){
          w=sc.nextInt();
         h=sc.nextInt();
        if(w>l || h>l){
            if(w==h){
                System.out.println("Accepted");
            }
            else{
            System.out.println("Crop it");
            }
        }
            else if(w<l || h<l){
                if(w==h){
                    System.out.println("Accepted");
                }
                else{
            System.out.println("Upload another");
                }
        }
        else{
            System.out.println("Accepted");
        }
    }
    }
    }
