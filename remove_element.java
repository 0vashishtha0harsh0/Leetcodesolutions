//Remove element

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
         int k = 0;
       
        int expectednums[] = new int[n];
        for(int i =0;i<n;i++){
            
            if(nums[i]!= val){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;

        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[] = {3,2,2,3};
        int k = s.removeElement(nums,3);
        for(int i =0;i<k;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
