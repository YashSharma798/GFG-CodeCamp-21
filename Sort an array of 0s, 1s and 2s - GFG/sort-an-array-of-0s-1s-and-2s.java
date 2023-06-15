//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
    //   for(int i=0 ; i<n ; i++)
    //   {
    //       for(int j=1; j<(n-i) ; j++)
    //       {
    //           if(a[j-1]>a[j]){
    //               int temp= a[j-1];
    //               a[j-1]=a[j];
    //               a[j]= temp;
    //           }
    //       }
    //   }
    
    // 2nd approach
        // int low=0, mid=0, high=0;
        
        // for(int i=0 ; i<n ; i++)
        // {
        //     if(a[i]==0)
        //         low++;
        //     else if(a[i]==1)
        //         mid++;
        //     else
        //         high++;
        // }
        // int i=0;
        // while(low>0)
        // {
        //     a[i++]=0;
        //     low--;
        // }
        // while(mid>0)
        // {
        //     a[i++]=1;
        //     mid--;
        // }
        // while(high>0)
        // {
        //     a[i++]=2;
        //     high--;
        // }
        
        
    //3rd approach - DFA(Dutch Flag Algorithm)
        
        int low=0, mid=0, high=n-1;
        
        while(mid<=high)
        {
            if(a[mid]==0){
                int temp= a[mid];
                a[mid]= a[low];
                a[low]=temp;
                
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                int temp= a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
                
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends