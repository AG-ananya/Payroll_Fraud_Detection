import java.util.Scanner;

public class str {
    public static void main(String args[]){
        //string where mulitple char are repeated consecutively, You are supposed to reduce the size of this string using mathematical logic given as in the ip:aabbbbeeeffggg op a2b4e3f2g3
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder S=new StringBuilder();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
            c++;
            }
            else{
                 S.append(s.charAt(i-1)).append(c);
                c=1;
            }
        }
        S.append(s.charAt(s.length()-1)).append(c);
        System.out.println(S.toString());
    }
}
