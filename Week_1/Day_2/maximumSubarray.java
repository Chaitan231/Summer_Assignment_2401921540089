package Week_1.Day_2;

public class maximumSubarray {
    public int maxSubArray(int[] arr) {
        int maxSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
           if(currSum<0){
            currSum=0;
           }
           currSum+=arr[i];
           if(currSum>maxSum){
            maxSum=currSum;
           }
        }
        return maxSum;
    }
}

