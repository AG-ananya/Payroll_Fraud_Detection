import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class arraylist3 {
//    public static void main(String[] args) {
       /*  ArrayList <Object>arr=new ArrayList<>();
        arr.add("java is a platform");
        arr.add(14);
        arr.add(1800L);
        arr.add(6.0D);
        arr.add(1.99F);
        display(arr);
        arr.set(1,10.0D);
        arr.set(0,50);
        System.out.println("ArrayList after modification");
        display(arr);
    }
    public static void display(ArrayList<Object>arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+"");
        }
        */

       /* ArrayList<String>al=new ArrayList<>();
        al.add("Mango");
        al.add("apple");
        al.add("banana");
        al.add("grapes");
        System.out.println("Returning element: " +al.get(1));
        //changing element
        al.set(1, "Dates");
        for(String fruit:al){
            System.out.println(fruit);
        }*/
        /**********************************************/        /*sort arraylist : Arraylist follow insertion order use Collections.sort() where collection is a class and an interface 
         java.util pacakge provides a utility class collections which has the static method sort()
        */

    /*ArrayList<String>al=new ArrayList<>();
    ArrayList<Integer>al2=new ArrayList<>();
    al.add("apple");
    al.add("orange");
    al.add("mango");
    al.add("banana");
    System.out.println("sorting number");
    al2.add(11);
    al2.add(51);
    al2.add(21);
    al2.add(1);
    Collections.sort(al);
    Collections.sort(al2);
    for(String i:al){
        System.out.println(i);
    }
    for(Integer j:al2){
        System.out.println(j);
    }*/
       /**********************************************/
           // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to modify the string
    public static String modifyString(String s,int x) {
        int[] freq = new int[256]; // Frequency array for all ASCII characters
        StringBuilder result = new StringBuilder();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Modify string based on frequency
        for (char ch : s.toCharArray()) {
            if (isPrime(freq[ch])) {
                result.append((char) (ch + x));
                 // Shift ASCII value
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        String input = "abcda"; // Given input
        int x=3;
        String output = modifyString(input,x);
        System.out.println("Output: " + output);
    }
}