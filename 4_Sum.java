//4 Sum Problem
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        
        for(int a =0;a<n-3;a++){
            if(a>0&&nums[a]==nums[a-1]){
            continue;
         }
            for(int b = a+1;b<n-2;b++){
            if(b>a+1&&nums[b]==nums[b-1]){
            continue;
         }
         int c = b+1;
         int d = n-1;
         
         
         

            while(c<d){
                long sum =(long) nums[a]+nums[b]+nums[c]+nums[d];
                if(sum==target){
                   output.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d])); 
                
                c++;
                d--;
                while(c<d&&nums[c]==nums[c-1]){
                    c++;
                }
               
                while(d>c&&nums[d]==nums[d+1]){
                    d--;
                }
            
                }
               
            
            else if(sum<target){
                c++;

            }
            else {
                d--;
                
            }
            }
            

            
            }
        }
        return output;
        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[]={1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(s.fourSum(nums,target));
    }
}
