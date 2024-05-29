package leetCodeProblems_Array;

public class MaxProfit {
	
	public static int maxProfit(int[] prices){
		if(prices == null || prices.length == 0) {
			return 0;
		}
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
				
			}
			else {
				int profit = price - minPrice;
				
				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		
		int[] prices1 = {7,1,5,3,6,4};
		System.out.println("MaxProfit for price1 : " + maxProfit(prices1));
		
		int[] prices2 = {7,6,4,3,1};
		System.out.println("MaxProfit for price2 : " + maxProfit(prices2));
		

	}

}
