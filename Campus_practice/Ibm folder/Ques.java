public class Ques {
        public static void main(String[] args) {
            //HCF without recursion
            int x=70;
    int y=15;
    int n=1;
    for(int i=1;i<y;i++){
        if(x%i==0&& y%i==0){
    n*=i;
        }
    }
    System.out.println(n);
        }
    }