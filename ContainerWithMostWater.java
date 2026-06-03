package Week_1.Day 3;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int ans=0,right=height.length-1,left=0;
        while(left<right){
            int width=right-left;
            int heightOfContainer=Math.min(height[left],height[right]);
            int area=width*heightOfContainer;
            ans=Math.max(ans,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}

