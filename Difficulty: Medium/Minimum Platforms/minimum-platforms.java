//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);

            int arr[] = new int[n];
            int dep[] = new int[n];

            str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) dep[i] = Integer.parseInt(str[i]);

            System.out.println(new Solution().findPlatform(arr, dep));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platforms_needed = 1;
        int result = 1;
        int i = 1, j = 0;
        int n = arr.length;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                i++;
            } else {
                platforms_needed--;
                j++;
            }
            result = Math.max(result, platforms_needed);
        }
        return result;
    }
}
