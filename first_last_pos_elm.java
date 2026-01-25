// search range 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int st =-1;
        int end = -1;

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(st==-1){
                 st = i;
                }
                 
               
                 end = i;
            }
            
              
                
               
            }
            
            return new int[]{st,end};
        }
        
    
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[]={5,7,7,8,8,10};
        System.out.println(s.searchRange(nums,8));

    }
}
