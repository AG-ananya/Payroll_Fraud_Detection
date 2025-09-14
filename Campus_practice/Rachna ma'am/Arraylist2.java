import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist2 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(32);
        list.add(67);
        list.add(98);
        list.add(100);
        Object []arr=list.toArray(new Object[0]);
        System.out.println(Arrays.toString(arr));
    }
}
