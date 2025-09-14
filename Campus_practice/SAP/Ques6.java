import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int s=0, e=str.length()-1;
        int c=0;
        // remove or delete the min no. of from the string so it become palindrome
        while (s<=e) {
            if(str.charAt(s)==str.charAt(e)){
                continue;
            }
            else{
                c++;
            }
        }
System.out.println(c);
    }
}
