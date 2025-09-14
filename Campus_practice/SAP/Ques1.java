import java.util.*;
public class Ques1{
    // wap to reduce given string on the basis of some condition 1. you need to count the freq of a char and write it after that char 2. there is no case sensitivity i.e A and a will be same 3. char in string can be randomly arranged but when you gave the op you need to ensure the sequence of character in string first
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        /*HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch: str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.print(entry.getKey()+"" + entry.getValue());
        }*/
    }
}