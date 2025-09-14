import java.util.Arrays;

public class PrefixSumOptimized {
    public static void computeAndPrintPrefixSum(int[] arr) {
        int sum = 0;
        System.out.print("Prefix Sum: ");
        
        for (int num : arr) {
            sum += num;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example input array
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        computeAndPrintPrefixSum(arr);
    }
}
