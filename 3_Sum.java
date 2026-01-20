//ThreeSum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum= new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
       
        

        for(int i=0;i<n-2;i++){
        int j = i+1;
        int k = n-1; 
        if(i>0&&nums[i]==nums[i-1]){
            continue;
        }
            
            while(j<k){ 
                 
            int sum = nums[i]+nums[j]+nums[k];
           
            
          
            
            if(sum==0){
                List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                
                threeSum.add(list);
                while(j<k && nums[j]==nums[j+1]){
                j++;
            }
            while(k>j&&nums[k]==nums[k-1]){
                k--;
            }
            j++;
            k--;
                
            
            }
            
            else if(sum<0){
                j++;
            }
            else{
              k--;
            }
            
            
            }


        }
        return threeSum;

        
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int nums[] = {-1,0,1,2,1,-4};
        s.threeSum(nums);
    }
}
