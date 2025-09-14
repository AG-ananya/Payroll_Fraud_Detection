import java.util.Scanner;

public class Ques2{
    public static void main(String[] args) {
        //string title
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String word[]=str.split(" ");
        for(int i=0;i<str.length();i++){
            word[i]=word[0].toUpperCase();
        }
        for(int i=0;i<word.length;i++){
            System.out.print(word[i]);
        }
    }
}
