import java.util.*;

public class SegmentedSieve {
    
    // Function to find prime numbers up to sqrt(R) using the Sieve of Eratosthenes
    public static List<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes.add(i);
        }
        
        return primes;
    }
    
    // Segmented Sieve function to find primes in range [L, R]
    public static void segmentedSieve(int L, int R) {
        int limit = (int) Math.sqrt(R);
        List<Integer> primes = simpleSieve(limit); // Find small primes up to sqrt(R)

        boolean[] isPrime = new boolean[R - L + 1];
        Arrays.fill(isPrime, true);

        // Mark multiples of each prime in the segment [L, R]
        for (int prime : primes) {
            int start = Math.max(prime * prime, (L + prime - 1) / prime * prime);

            for (int j = start; j <= R; j += prime) {
                isPrime[j - L] = false;
            }
        }

        // Print the primes in the given range
        ArrayList <Integer>arr=new ArrayList<>();
        int k=0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] && (i + L) >= 2) {
              System.out.print((i + L) + " ");
              
            }
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        int L = 3, R = 50;  // Example range
        segmentedSieve(L, R);
    }
}