// Remove element from sorted array
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        // int expectednums [] = new int[n];
        int k =1;
        for(int i=1;i<n;i++){
            
                if(nums[i]!=nums[i-1]){
                    nums[k]=nums[i];
                    k++;

                }
                
            }
            return k;
        }
            
      
        

        

        
    
    public static void main(String args[]){
        Solution s = new Solution();

        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int k =s.removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++){
                System.out.println(nums[i]+" ");
            }
    }
}
