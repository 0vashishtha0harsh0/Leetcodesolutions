// Search in Rotated sorted array

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i<n;i++ ){
            if(nums[i]==target){
                return i;
            }
            

        }
        return -1;

        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(s.search(nums,0));
    }
}
