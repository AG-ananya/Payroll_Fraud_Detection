public class Ques1 {
    public static void main(String[] args) {
        //decimal to binary
        float n=5;
        float an=1;
        while(n>0){
            int res=(int)n/2;
an=(an*10)+n;
n=n%10;
        }
        System.out.println(an);
    }
}
