import java.util.Scanner;

public class Ques4 {
    public static void main(String str[]){
        //find min dist b/w given two words ip ["the","quick","brown","fox","quick"] word1="the", word2="fox" op 3
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String stri[]=new String[n];
        for(int i=0;i<n;i++){
            stri[i]=sc.next();
        }
        String word1=sc.next();
        String word2=sc.next();
        int s=0,e=stri.length-1;
        int ans=Integer.MAX_VALUE;
        int res=0;
        while (s<e) {
           if(stri[s].equals(word1) && stri[e].equals(word2) ){
                 ans=Math.min(ans, e-s);
           }
           s++;e--;
    }
    System.out.println(ans);
    }
}
