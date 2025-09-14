import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();//create arraylist
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator it=list.iterator();//itreator 
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}