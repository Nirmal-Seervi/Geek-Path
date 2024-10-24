//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().modifyAndRearrangeArr(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;
		int j = 1;
		for(int i = 0; i < n - 1; i++){
		    if(arr[i] == arr[j]){
		        arr[i] = arr[i] + arr[j];
		        arr[j] = 0;
		        
		    }
		    j++;
		}
		List<Integer> arr1 = new ArrayList<>();
		int k = 0;
		for(int i = 0; i < n; i++){
		    if(arr[i] != 0){
		        arr1.add(arr[i]);
		        k++;
		    }
		}
		for(int i = arr1.size() + 1; i <= n; i++){
		    arr1.add(0);
		}
		ArrayList<Integer> arr2 = new ArrayList<>(arr1);

		return arr2;
    }
}
