package Week_1.Day_1;

public class BuyAndSellStock {  
    public int maxProfit(int[] prices) {
        int ans=0;
        
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minPrice;
            if(profit>ans){
                ans=profit;
            }
            minPrice=Math.min(prices[i],minPrice);      
        }
        return ans;
    }
}
