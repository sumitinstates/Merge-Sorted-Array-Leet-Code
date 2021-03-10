package com.sumit;


public class Solution {
	
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0, j=0, k=0;
        int[]a = new int[m+n];
        
        while(i<m&&j<n)
        { 
        	System.out.println("i value is : " + i);
        	System.out.println("j value is : " + j);
        	
            if(nums1[i]<=nums2[j])
            {
                a[k] = nums1[i];
                i++;
                k++;
            } 
            else 
            {
                a[k] = nums2[j];
                j++;
                k++; 
            }
        }
        
        while(i<m) {
        	a[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<n) {
        	a[k] = nums2[j];
            j++;
            k++;
        }
        
        for(int x : a) {
        	System.out.println(x);
        }
     
    }
   
   public static void main(String[] args) {
	int[] nums1 = {1,2,3,0,0,0};
	int[] nums2 = {2,5,6};
	int m = 3;
	int n=3;
	
	Solution.merge(nums1, m, nums2, n);
}

}
