package Day_5;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq=new LinkedList<Integer>();
        List<Integer> answers=new ArrayList<>();
        int n=nums.length;
        deq.offer(0);
        for(int i=0;i<k;i++){
            while(deq.size()>0&&nums[deq.peekLast()]<nums[i]){
                deq.removeLast();
            }
            deq.offerLast(i);
        }
        answers.add(nums[deq.peek()]);
        for(int j=k;j<n;j++){
            int startingPoint=j-k+1;
            while(deq.size()>0&&deq.peek()<startingPoint){
                deq.removeFirst();
            }
            while(deq.size()>0&&nums[deq.peekLast()]<nums[j]){
                deq.removeLast();
            }
            deq.offerLast(j);
            answers.add(nums[deq.peek()]);
        }
        int[] ans=new int[answers.size()];
        for(int i=0;i<answers.size();i++){
            ans[i]=answers.get(i);
        }
        return ans;
    }
}

