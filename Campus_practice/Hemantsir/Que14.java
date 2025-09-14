import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Que14 {
    /*
     you are given an array of length and another item called k and an integer x your job is to find sum of the k farthest item from x.
     ip 5 3 20
     arr 21 4 15 17 11
     op 30

     write an algo and code to find longest common subsequence

     wAP to implement DFS
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int x = sc.nextInt(); 

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<int[]> diffs = new ArrayList<>();
        for (int val : arr) {
            diffs.add(new int[]{Math.abs(val - x), val});
        }

        diffs.sort((a, b) -> Integer.compare(b[0], a[0]));
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += diffs.get(i)[1];
        }

        System.out.println(sum);
    }
}
