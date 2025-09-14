import java.util.ArrayList;

public class Arraylist4 {
public static void main(String[] args) {
    ArrayList<Integer>al=new ArrayList<>();
    al.add(23);
    al.add(63);
    al.add(32);
    al.add(45);
    al.removeIf(n->(n%3==0));//lambda expression
    for(int i: al){
        System.out.println(i);
    }
}
}