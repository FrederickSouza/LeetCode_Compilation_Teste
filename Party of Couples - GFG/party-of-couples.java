//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findSingle(int N, int arr[]){
        // code here
        if(N == 1) return arr[0];
        
		Map<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		
		for (int i = 0; i<N-1 ; i++) {
			for (int j = i+1; j<N ; j++) {
				//System.out.println("i:" + i + " j:" + j);
				if (hm.get(arr[i]) != null) break;
				
				if (arr[i] == arr[j]) {
					hm.put(arr[i], true);
					break;
				}
				
				if (j == N-1) return arr[i];
			}
			//System.out.println("loop i");
		}
		
		return -1;
    }
}