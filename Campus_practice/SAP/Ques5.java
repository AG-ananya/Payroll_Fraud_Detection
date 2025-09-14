import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        //pangram a string contain all letter from a to z
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        if(s.contains("a") &&s.contains("b") &&s.contains("c") &&s.contains("d") && s.contains("e") &&s.contains("f") &&s.contains("g") &&s.contains("h") && s.contains("i") &&s.contains("j") &&s.contains("k") &&s.contains("l") && s.contains("m") &&s.contains("n") &&s.contains("o") &&s.contains("p") && s.contains("q") &&s.contains("r") &&s.contains("s") &&s.contains("t") && s.contains("u") &&s.contains("v") &&s.contains("w") &&s.contains("x") && s.contains("y") && s.contains("z")){
            System.out.println("is a pangram");
        }
        else{
            System.out.println("not");
        }
    }
}
