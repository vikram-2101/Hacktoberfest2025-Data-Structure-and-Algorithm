hpackage Greedy;

import java.util.*;

// You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. Ap 
// pair (c,d) can come after pari(a,b) if b<c. Find the longest chain which can be formed from a given set of pairs
public class MaxLengthChainOfPair { // O (nlogn)
    public static void main(String[] args) {
        int pairs[][] = {
                { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 },
        };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // last selected pair
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max chain length: " + chainLength);
    }
}
