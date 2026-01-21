//3 Sum Closest
import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i =0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)< Math.abs(closest-target)){
                    closest = sum;
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return sum;
                }
                                
            }
        }    
                     
            
                    
            
            return closest;
                    
                    
                

           
            

        
    
    }
    
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[]={-1,2,1,-4};
        System.out.println(s.threeSumClosest(nums,1));
    }
}
