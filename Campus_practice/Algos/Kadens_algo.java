
public class Kadens_algo{
    public static int maxsubarray(int[]arr){
int maxsum=Integer.MIN_VALUE;
int currentval=0;
for(int i:arr){
    currentval+=i;
    maxsum=Math.max(maxsum, currentval);
    if(currentval<0){
        currentval=0;
    }
} 
return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxsubarray(arr));
    }
}
