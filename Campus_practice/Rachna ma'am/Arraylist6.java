import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
ArrayList<String>s=new ArrayList<>();
        s.add("snhea");
        s.add("Ananya");
        s.add("Aradhya");
        s.add("samarth");
        s.add("kriti");
        s.add("shruti");
        s.add("shradhha");
        s.add("radha");
        s.add("kritika");
        s.removeIf(n->n.charAt(0)=='s');//lambda expression
    for(String i: s){
        System.out.println(i);
    }
    }
}