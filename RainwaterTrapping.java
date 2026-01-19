//Water trappping Problem
import java.util.*;
Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1]=height[n-1];
        for(int j = n-2;j>=0;j--){
            rightmax[j]=Math.max(height[j],rightmax[j+1]);

        }
        int trapped = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapped+=waterlevel-height[i];
        }
        return trapped;

        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The tapped water is :"+s.trap(height));
        
    }
}
