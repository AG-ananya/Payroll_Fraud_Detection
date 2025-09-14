import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
public class Arraylist7 {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<String>();
        li.add("ravi");
        li.add("vijay");
        li.add("ravi");
        li.add("ajay");
        System.out.println("Traversing through ListIterator");
        ListIterator<String> l=li.listIterator(li.size());
        while (l.hasPrevious()) {
            String str=l.previous();
        System.out.println(str);
        }
        System.out.println("Traversing through forEach()");
        li.forEach(a->{
            System.out.println(a);
        });
        System.out.println("Traversing Through loop");
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
        System.out.println("Traversing through forEachReamaining()");
        Iterator<String>itr=li.iterator();
        itr.forEachRemaining(a->
        System.err.println(a));
    }
}
