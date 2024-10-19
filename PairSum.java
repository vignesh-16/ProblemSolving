// Problem statement

// You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.

// Note:

// Each pair should be sorted i.e the first value should be less than or equals to the second value. 

// Return the list of pairs sorted in non-decreasing order of their first value. In case if two pairs have the same first value, the pair with a smaller second value should come first.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:

// 1 <= N <= 10^3
// -10^5 <= ARR[i] <= 10^5
// -2 * 10^5 <= S <= 2 * 10^5

// Time Limit: 1 sec

// Sample Input 1:

// 5 5
// 1 2 3 4 5

// Sample Output 1:

// 1 4
// 2 3

// Explaination For Sample Output 1:

// Here, 1 + 4 = 5
//       2 + 3 = 5
// Hence the output will be, (1,4) , (2,3)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int s = 5;
        findPairs(arr, s);
    }

    public static List<int[]> findPairs(int[] arr, int s) {
        List<int[]> pairs = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]+arr[j] == s) {
                    int[] currentPair = {arr[i],arr[j]};
                    pairs.add(currentPair);
                }
            }
        }
        return pairs;
    }

}