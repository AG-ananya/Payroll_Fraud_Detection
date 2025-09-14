import java.util.ArrayList;
import java.util.Collections;

public class Arraylist5 {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
al.add("mango");
al.add("apple");
al.add("orange");
al.add("grapes");
Collections.sort(al);
System.out.println(al);
ArrayList<Integer>l=new ArrayList<>();
l.add(21);
l.add(11);
l.add(51);
l.add(1);
Collections.sort(l);
System.out.println(l);
    }
}
