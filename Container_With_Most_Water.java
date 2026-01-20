//Container with most water
import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea=0;
        
        int leftmax=0;
        int rightmax=n-1;
        while(leftmax<rightmax){
            int h = Math.min(height[leftmax],height[rightmax]);
            int width = rightmax - leftmax;
            maxarea=Math.max(maxarea,h*width);
            if(height[leftmax]<height[rightmax]){
                leftmax++;

            }
            else{
                rightmax--;
            }
        }
            return maxarea;

        
    }

        

    
    public static void main(String args[]){
        Solution s = new Solution();
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("The maximum area is " + s.maxArea(height) );
        
    }
        
    }
