/**
 * 
 */
package dp;

/**
 * @author zhengqiang
 *
 */
public class GiveChangeByDP {

	/**
	 * @param args
	 */
	public int getMinNum(int[] moneySize,int change){
		int[] dp=new int[change+1];
		for(int i=0;i<change+1;i++){
			dp[i]=i;
		}
		
		for(int i=1;i<change+1;i++){
			for(int j=0;j<moneySize.length;j++){
				if(i>=moneySize[j]){
					dp[i]=(dp[i-moneySize[j]]+1)>dp[i]?dp[i]:dp[i-moneySize[j]]+1;
				}
				
			}
		}
		return dp[change];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] moneySize={1,3,5};
		int change=11;
		
		int moneySize2[]={100,50,20,10,5,2,1};
		int change2=212;
		
		GiveChangeByDP dp=new GiveChangeByDP();
		int minNum=dp.getMinNum(moneySize, change);
		int minNum2=dp.getMinNum(moneySize2, change2);
		
		System.out.println(minNum);
		System.out.println(minNum2);
	}

}
