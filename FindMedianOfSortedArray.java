//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sorted[] = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            sorted[i]=nums1[i];
        }
        for(int j =0;j<nums2.length;j++){
            sorted[nums1.length+j]=nums2[j];
            

        }
        Arrays.sort(sorted);
        int n = sorted.length;
        
            if(sorted.length%2 !=0){
               return  sorted[n/2];
          
            }
            else{
               return (sorted[n/2]+sorted[(n/2)-1])/2.0;
            }
           

        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int nums1[]={1,2};
        int nums2[]={3,4};
        System.out.println(s.findMedianSortedArrays(nums1,nums2));
    }
}
